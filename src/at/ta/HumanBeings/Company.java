package at.ta.HumanBeings;

import java.util.ArrayList;
import java.util.List;

public class Company extends Companies {
    private double annualSales;
    private double goodwill;
    private int companyWork;
    private List<OfficeWorker> officeWorkers;

    public Company(String companyName, String adress, int foundingYear, String founder, double annualSales, double goodwill, int companyWork) {
        super(companyName, adress, foundingYear, founder);
        this.annualSales = annualSales;
        this.goodwill = goodwill;
        this.companyWork = companyWork;
        this.officeWorkers = new ArrayList<>();
    }

    public double getAnnualSales() {
        return annualSales;
    }

    public double getGoodwill() {
        return goodwill;
    }

    public int getCompanyWork() {
        return companyWork;
    }

    //zur liste hinzufügen
    public void addOfficeWorker(OfficeWorker officeWorker) {
        this.officeWorkers.add(officeWorker);
    }

    //printed alle mitarbeiter
    public void printYourEmployee() {
        System.out.println();
        System.out.println("****Offic Worker****");
        for (OfficeWorker officeWorker : this.officeWorkers) {
            officeWorker.printEmployeesData();
        }
        System.out.println();
        System.out.println("****End****");
    }

    @Override
    public void printTheBaseData() {
        super.printTheBaseData();
        System.out.println("Yearly Annual Sales: " + getAnnualSales() + " €.");
        System.out.println("Company good will: " + getGoodwill() + " €.");
        System.out.println("How many Company Work: " + getCompanyWork());
    }
}
