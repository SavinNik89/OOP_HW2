package HW_4;

import java.util.ArrayList;
import java.util.Iterator;

public class Box <E extends Fruit> {

    private static int counter = 1;

    ArrayList<E> box;
    private float weightBox;


    private int id;

    public Box() {
        this.box = new ArrayList<>();
        this.weightBox = 0.0F;
        this.id = counter;
        counter++;
    }

    public Box(ArrayList<E> box1) {
        this.box = new ArrayList<>(box1);
        this.weightBox = getWeightBox(box);
        this.id = counter;
        counter++;
    }

    public void add (E fruit) {
        this.box.add(fruit);
        this.weightBox = this.weightBox + fruit.weight;
    }

    public void shift (Box <E> to) {
        Iterator<E> boxIterator = this.box.iterator();
        while (boxIterator.hasNext()) {
            to.add(boxIterator.next());
            boxIterator.remove();
        }
        this.weightBox = 0;
    }

    public float getWeightBox (ArrayList <E> box) {
        for (E o : box) {
            this.weightBox = this.weightBox + o.weight;
        }
        return weightBox;
        }




    public boolean compare(Box o) {
        return Float.compare(this.weightBox, o.weightBox) == 0;
    }


    @Override
    public String toString() {
        if (this.box.size()==0) {return String.format("Коробка № %d: пуста, вес: %.2f", this.id, this.weightBox);}
        else {
            if (this.box.get(0) instanceof Apple) {return String.format("Коробка № %d: яблоки, вес: %.2f", this.id, this.weightBox);}
            if (this.box.get(0) instanceof Orange) {return String.format("Коробка № %d: апельсины, вес: %.2f", this.id, this.weightBox);}
            else return String.format("Коробка № %d: пуста, вес: %.2f", this.id, this.weightBox);
        }
    }
}
