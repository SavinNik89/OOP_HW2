package interim_certification;

import java.util.Random;

public class Program {
    public static void main(String[] args) {

        Random random = new Random();

        Publisher jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", jobAgency);
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);

        jobAgency.registerObserver(new Master("Ivanov", "Курьер"));
        jobAgency.registerObserver(new Master("Petrov", "Программист"));
        jobAgency.registerObserver(new Student("Sidorov", "Программист"));
        jobAgency.registerObserver(new Manager("Pryadko", "Руководитель"));
        jobAgency.registerObserver(new Student("Alekseev", "Продавец"));
        jobAgency.registerObserver(new Manager("Levitan", "Юрист"));

        for (int i = 0; i < 5; i++){
            geekBrains.needEmployee(VacancyType.It, random.nextDouble(90000, 100000));
            google.needEmployee(VacancyType.Director, random.nextDouble(150000, 200000));
            google.needEmployee(VacancyType.Lawyer, random.nextDouble(100000, 105000));
            yandex.needEmployee(VacancyType.Courier, random.nextDouble(30000, 50000));
            yandex.needEmployee(VacancyType.Seller, random.nextDouble(100000, 110000));

            System.out.println("________________________________");
        }
    }



}
