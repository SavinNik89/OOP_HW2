package HW_3;

public class Freelancer extends Emploee {

    int timeWorked;
    public Freelancer(String name, String surname, double salary, int age, int timeWorked) {
        super(name, surname, salary, age);
        this.timeWorked = timeWorked;
    }



    public int getTimeWorked() {
        return timeWorked;
    }

    public void setTimeWorked(int timeWorked) {
        this.timeWorked = timeWorked;
    }

    @Override
    public double calculateMonthlySalary () {
        double res = this.salary * timeWorked;
        return res;
    }

    public String toString() {
        return String.format("%s %s, возраст: %d; Фрилансер; Месячная заработная плата (почасовая ставка = %.2f руб): " +
                "%.2f (руб.)", this.surname, this.name, this.age, this.salary, this.calculateMonthlySalary());
    }


}
