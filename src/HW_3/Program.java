package HW_3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    static Random random = new Random();


    static Emploee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        String[] typeOfWorker = new String[] {"Worker", "Freelancer"};

        double salaryMonth = random.nextDouble(20000, 80000);
        double salaryHour = random.nextDouble(20, 80);
        int timeWorked = random.nextInt(1,150);
        int age = random.nextInt(18, 66);

        String type = typeOfWorker[random.nextInt(2)];

        if (type == "Worker") {
            return new Worker (names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], salaryMonth, age);
        }
        else return new Freelancer (names[random.nextInt(2)], surnames[random.nextInt(surnames.length)], salaryHour, age, timeWorked);
    }




    public static void main(String[] args) {
        Emploee[] employees = new Emploee[100];
        for(int i = 0; i < employees.length; ++i) {
            employees[i] = generateEmployee();
        }

        //Arrays.sort (employees, new ComparatorSalary());
        Arrays.sort (employees, new ComparatorSurname());

        for (Emploee x : employees) {
            System.out.println(x);
        }


    }

}
