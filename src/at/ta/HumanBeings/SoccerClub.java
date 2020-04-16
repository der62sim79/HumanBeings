package at.ta.HumanBeings;

import java.util.ArrayList;
import java.util.List;

public class SoccerClub extends Companies {
    private int federalDivisionWins;
    private int championsLeaguePlays;
    private int cupMatchWins;
    private List<Soccers> soccers;

    public SoccerClub(String companyName, String adress, int foundingYear, String founder, int championsLeaguePlays, int federalDivisionWins,
                      int cupMatchWins) {
        super(companyName, adress, foundingYear, founder);
        this.championsLeaguePlays = championsLeaguePlays;
        this.federalDivisionWins = federalDivisionWins;
        this.cupMatchWins = cupMatchWins;
        this.soccers = new ArrayList<>();
    }

    public int getFederalDivisionWins() {
        return federalDivisionWins;
    }

    public int getChampionsLeaguePlays() {
        return championsLeaguePlays;
    }

    public int getCupMatchWins() {
        return cupMatchWins;
    }

    public void printAllSoccer() {
        System.out.println("****All Club Player****");
        for (Soccers soccers : this.soccers) {
            soccers.printBaseDataPerson();
        }
        System.out.println();
        System.out.println("****END****");
    }

    public void addSoccer(Soccers soccers) {
        this.soccers.add(soccers);
    }


    @Override
    public void printTheBaseData() {
        super.printTheBaseData();
        System.out.println("Champion League Plays: " + getChampionsLeaguePlays());
        System.out.println("Cup Match Wins: " + getCupMatchWins());
        System.out.println("Federal Division Wins: " + getFederalDivisionWins());
    }
}
