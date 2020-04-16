package at.ta.HumanBeings;

public class Athlete extends People {
    private String whichSport;
    private String nationality;
    private int healthCondition;

    public Athlete(String name, String lastName, double size, int age, double weight, String whichSport, String nationality, int healthCondition) {
        super(name, lastName, size, age, weight);
        this.whichSport = whichSport;
        this.nationality = nationality;
        this.healthCondition = healthCondition;
    }

    public String getWhichSport() {
        return whichSport;
    }

    public String getNationality() {
        return nationality;
    }

    public int getHealthCondition() {
        return healthCondition;
    }

    public void readyForCompetition() {
        if (this.getHealthCondition() > 75) {
            System.out.println();
            System.out.println("Is the Athlete ready for the Competition?");
            System.out.println("YES, Athlete are ready for the Competition.");
            System.out.println();
        } else {
            System.out.println();
            System.out.println("Is the Athlete ready for the Competition?");
            System.out.println("NO, Athlete aren´t ready for the Competition.");
            System.out.println();
        }
    }

    public void ageGroupTeams() {
        System.out.println();
        if (getAge() <= 3) {
            System.out.println(getFirstName() + " smaller then 4 so he cant get in a Team");
        } else if (getAge() >= 4 && getAge() <= 7) {
            System.out.println(getFirstName() + " plays in U7 Team (Toddler Team)");
        } else if (getAge() >= 8 && getAge() <= 12) {
            System.out.println(getFirstName() + " plays in U12 Team(Kid Team)");
        } else if (getAge() >= 13 && getAge() <= 17) {
            System.out.println(getFirstName() + " plays in U17 Team (Youth Team)");
        } else if (getAge() >= 18 && getAge() <= 40) {
            System.out.println(getFirstName() + " plays in 1A Team");
        } else {
            System.out.println(getFirstName() + " plays in 2A Team (Senior)");
        }
        System.out.println();
    }

    @Override
    public void printBaseDataPerson() {
        super.printBaseDataPerson();
        System.out.println("Nationality: " + getNationality());
        System.out.println("Wich Sport: " + getWhichSport());
        System.out.println("Health Condition: " + getHealthCondition());
    }
}
