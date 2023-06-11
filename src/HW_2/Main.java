package HW_2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat tomas = new Cat("Tomas", 5);
        Cat barsik = new Cat("Barsik", 10);
        Cat murzik = new Cat("Murzik", 7);
        Cat musya = new Cat("Musya", 3);
        Cat shmyak = new Cat("Shmyak", 15);

        Plate plate = new Plate(35);
        plate.info();

        List <Cat> cats = new ArrayList<>();
        cats.add(tomas);
        cats.add(barsik);
        cats.add(murzik);
        cats.add(musya);
        cats.add(shmyak);

        feeding (cats, plate);

        plate.info();
        plate.addFood(5);

        feeding (cats, plate);
        plate.info();




        }
    public static void  feeding (List <Cat> cats, Plate plate) {
        for (Cat cat : cats) {
            cat.eat(plate);
            if (cat.isSatiety()) {
                System.out.println(cat.getName() + " наелся");
            }
            else {
                System.out.println(cat.getName() + " голоден" + " добавьте " + (cat.getAppetite()- plate.getFood()) + " еды");
            }
        }


    }
}