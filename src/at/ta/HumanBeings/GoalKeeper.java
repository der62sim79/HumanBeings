package at.ta.HumanBeings;

public class GoalKeeper extends Soccers {
    private int keepPenalty;
    private int keepAmountAllBall;


    public GoalKeeper(String name, String lastName, double size, int age, double weight, String whichSport,
                      String nationality, int healthCondition, int playerNumber, int marketValue,
                      int keepAmountAllBall, int keepPenalty) {
        super(name, lastName, size, age, weight, whichSport, nationality, healthCondition, playerNumber, marketValue);
        this.keepAmountAllBall = keepAmountAllBall;
        this.keepPenalty = keepPenalty;
    }

    public int getKeepPenalty() {
        return keepPenalty;
    }

    public int getKeepAmountAllBall() {
        return keepAmountAllBall;
    }

    public void keepShoots() {
        this.keepAmountAllBall = this.keepAmountAllBall + 1;
    }

    public void keepPenaltyShoots() {
        this.keepAmountAllBall = this.keepAmountAllBall + 1;
        this.keepPenalty = this.keepPenalty + 1;
        System.out.println(getFirstName() + " keeps now " + getKeepPenalty() + " penalty.");
        System.out.println();
    }

    @Override
    public void printBaseDataPerson() {
        super.printBaseDataPerson();
        System.out.println("Keep Amount of Shoots: " + getKeepAmountAllBall());
        System.out.println("Keep Amount of penalty: " + getKeepPenalty());
    }
}
