package at.ta.HumanBeings;

public class Companies {
    private String companyName;
    private String adress;
    private int foundingYear;
    private String founder;

    public Companies(String companyName, String adress, int foundingYear, String founder) {
        this.companyName = companyName;
        this.adress = adress;
        this.foundingYear = foundingYear;
        this.founder = founder;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getAdress() {
        return adress;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public String getFounder() {
        return founder;
    }

    public void printTheBaseData() {
        System.out.println("Name: " + getCompanyName());
        System.out.println("Founder: " + getFounder());
        System.out.println("Founding Year: " + getFoundingYear());
        System.out.println("Adress: " + getAdress());
    }
}
