public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        if (appetite > 0){
            this.appetite = appetite;
            this.satiety = false;
        }
        else {
            this.appetite = 0;
            this.satiety = true;
        }
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (appetite <= plate.getFood()) {
            plate.setFood(plate.getFood() - appetite);
            satiety = true;
            appetite = 0;
        }
    }
}
