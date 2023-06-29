package interim_certification;

import java.util.Random;

public class Company {
    private String companyName;
    private  double maxSalary;
    private Publisher jobAgency;

    private static Random random = new Random();

    public Company(String companyName, Publisher jobAgency) {
        this.companyName = companyName;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(VacancyType nameVacancy, double maxSalary){
        Vacancy vacancy = new Vacancy(nameVacancy, maxSalary);
        jobAgency.sendOffer(companyName, vacancy);
    }
}
