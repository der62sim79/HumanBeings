package at.ta.HumanBeings;


public class OfficeWorker extends People {
    private String bankDetails;
    private double hourlyWages;
    private double hoursOfWorkAtMonth;

    public OfficeWorker(String name, String lastName, double size, int age, double weight, String bankDetails,
                        double hourlyWages, double hoursOfWorkAtMonth) {
        super(name, lastName, size, age, weight);
        this.bankDetails = bankDetails;
        this.hourlyWages = hourlyWages;
        this.hoursOfWorkAtMonth = hoursOfWorkAtMonth;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public double getHourlyWages() {
        return hourlyWages;
    }

    public double getHoursOfWorkAtMonth() {
        return hoursOfWorkAtMonth;
    }

    public void printEmployeesData() {
        printName();
        System.out.println("Bank Details: " + getBankDetails());
        System.out.println("Hourly Wages: " + getHourlyWages());
        System.out.println("Working hours: " + getHoursOfWorkAtMonth());
    }

    public double workingHour(double amount) {
        double workHours = amount;
        double actualHours = getHoursOfWorkAtMonth();
        actualHours = actualHours + workHours;
        this.hoursOfWorkAtMonth = actualHours;
        System.out.println("Your Working hour is now: " + getHoursOfWorkAtMonth());
        System.out.println();
        return this.getHoursOfWorkAtMonth();

    }

    public void paySlipGross() {
        double monthPaySlip = getHoursOfWorkAtMonth() * getHourlyWages();
        System.out.println(getFirstName() + " " + getLastName() + " get for this month: " + monthPaySlip + " € Gross.");
        System.out.println();
    }
}
