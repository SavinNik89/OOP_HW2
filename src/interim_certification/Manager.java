package interim_certification;

import java.util.Random;

public class Manager implements Observer {

    private String name;
    private double minSalary;

    private String nameVacancy;

    private boolean hasJob;
    private static Random random = new Random();


    public Manager (String name, String vacancy) {
        this.name = name;
        this.nameVacancy = vacancy;
        minSalary = random.nextDouble(90000, 180000);
        hasJob = false;
    }


    @Override
    public void receiveOffer(String companyName, double salary, String vacancy) {
        if (minSalary <= salary){
            System.out.printf("%s %s (%.2f) >>> Мне нужна эта работа (%s)! [%s - %.2f]\n",
                    this, name, minSalary, vacancy, companyName, salary);
            hasJob = true;
        }
        else {
            System.out.printf("%s %s >>> Я найду работу (%s) получше (%.2f)! [%s - %.2f]\n",
                    this, name, vacancy, minSalary, companyName, salary);
        }
    }

    public boolean takeJob(String vacancy) {
        return hasJob;
    }

    public String getVacancyName() {
        return nameVacancy;
    }

    public String toString() {
        return "Менеджер";
    }

}
