package at.ta.HumanBeings;

public class Forward extends Soccers {
    private int shootingGoals;
    private int seasonPlay;

    public Forward(String name, String lastName, double size, int age, double weight, String whichSport,
                   String nationality, int healthCondition, int playerNumber, int marketValue,
                   int seasonPlay, int shootingGoals) {
        super(name, lastName, size, age, weight, whichSport, nationality, healthCondition, playerNumber, marketValue);
        this.seasonPlay = seasonPlay;
        this.shootingGoals = shootingGoals;
    }

    public int getShootingGoals() {
        return shootingGoals;
    }

    public int getSeasonPlay() {
        return seasonPlay;
    }

    public void shootGoal() {
        this.shootingGoals = this.shootingGoals + 1;
        System.out.println(getFirstName() + " shoot a Goal!!");
        System.out.println();
    }

    public void playGame() {
        this.seasonPlay = this.seasonPlay + 1;
        System.out.println(getFirstName() + " play now: " + getSeasonPlay() + " games.");
        System.out.println();
    }


    @Override
    public void printBaseDataPerson() {
        super.printBaseDataPerson();
        System.out.println("How many Goals shooting: " + getShootingGoals());
        System.out.println("How many Game he Play: " + getSeasonPlay());
    }
}
