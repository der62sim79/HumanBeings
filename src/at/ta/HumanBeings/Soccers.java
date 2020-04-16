package at.ta.HumanBeings;

public class Soccers extends Athlete {
    private int playerNumber;
    private int marketValue;

    public Soccers(String name, String lastName, double size, int age, double weight, String whichSport, String nationality,
                   int healthCondition, int playerNumber, int marketValue) {
        super(name, lastName, size, age, weight, whichSport, nationality, healthCondition);
        this.playerNumber = playerNumber;
        this.marketValue = marketValue;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public int getMarketValue() {
        return marketValue;
    }

    public void printSoccerMarketValue() {
        if (getMarketValue() > 100000) {
            System.out.println("The number " + getPlayerNumber() + " with the name " + getFirstName() + " is with " +
                    getMarketValue() + " € market value a expensive Soccer.");
        } else {
            System.out.println("The number " + getPlayerNumber() + " with the name " + getFirstName() + " is with " +
                    getMarketValue() + " € market value is a cheaper Soccer.");
        }
    }

    @Override
    public void printBaseDataPerson() {
        super.printBaseDataPerson();
        System.out.println("Jersey number: " + getPlayerNumber());
        System.out.println("Market Value: " + getMarketValue());
    }

    @Override
    public void ageGroupTeams() {
        super.ageGroupTeams();
    }
}
