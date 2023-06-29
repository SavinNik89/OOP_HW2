package interim_certification;

public enum VacancyType {
    It("Программист"),
    Seller("Продавец"),
    Courier("Курьер"),
    Director("Руководитель"),
    Lawyer("Юрист");

    private String vacancy;
    VacancyType(String vacancy) {
        this.vacancy = vacancy;
    }

    public String getVacancy() {
        return vacancy;
    }
}
