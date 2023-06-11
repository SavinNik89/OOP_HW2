package HW_3;

public class Worker extends Emploee{

    public Worker(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);
    }

    @Override
    public double calculateMonthlySalary() {
        return salary;
    }

    public String toString() {
        return String.format("%s %s, возраст: %d; Рабочий; Месячная заработная плата (фиксированная месячная оплата): " +
                "%.2f (руб.)", this.surname, this.name, this.age,  this.calculateMonthlySalary());
    }

}
