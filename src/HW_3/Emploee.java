package HW_3;

public abstract class Emploee implements Comparable<Emploee>{
    protected String name;
    protected String surname;
    protected double salary;

    protected int age;



    public Emploee(String name, String surname, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }


    public abstract double calculateMonthlySalary ();

    public int compareTo(Emploee o) {
        int res = this.name.compareTo(o.name);
        return res == 0 ? Double.compare(this.calculateMonthlySalary(), o.calculateMonthlySalary()) : res;
    }

}
