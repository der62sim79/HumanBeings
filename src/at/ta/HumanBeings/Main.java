package at.ta.HumanBeings;

public class Main {

    public static void main(String[] args) {
        People people1 = new People("Otto", "Lang", 180.5, 30, 75.0);
        people1.printName();

        Athlete athlete1 = new Athlete("Ali", "Tonc", 179.3, 40, 100.0, "Boxing",
                "Austria", 80);
        // ob bereit  fürn Wettkampf
        athlete1.readyForCompetition();

        Soccers soccers1 = new Soccers("Robin", "Schulz", 180.0, 20, 75.0, "Soccer",
                "Germany", 100, 17, 10000000);
        //Marktwert
        soccers1.printSoccerMarketValue();

        Soccers soccers2 = new Soccers("Franz", "Schuh", 190.0, 20, 80, "Soccer",
                "Austria", 99, 10, 2000000);
        //alters gruppe
        soccers2.ageGroupTeams();

        Forward forward1 = new Forward("Schumacher", "Putz", 200.0, 30, 75, "Soccer",
                "Brasil", 85, 11, 20000000, 50, 20);
        //Spiel anzahl erhöhen
        forward1.playGame();

        Forward forward2 = new Forward("Mehmet", "Top", 175.2, 20, 75, "Soccer",
                "Turkey", 100, 25, 1000000, 20, 10);
        //Torschuss
        forward2.shootGoal();

        GoalKeeper goalKeeper1 = new GoalKeeper("Toni", "Mahoni", 200.0, 17, 90.0, "Soccer",
                "Austria", 79, 1, 1000000, 155, 30);
        //Elfmeter
        goalKeeper1.keepPenaltyShoots();
        //Haltet einen Ball
        goalKeeper1.keepShoots();

        //Angestellte v.People
        OfficeWorker officeWorker1 = new OfficeWorker("Ali", "T", 180, 40, 100.0,
                "A12345", 21.5, 45.0);
        //Arbeitsstunden hinzufügen
        officeWorker1.workingHour(8.0);

        OfficeWorker officeWorker2 = new OfficeWorker("Edi", "Ober", 175.0, 40, 85.0,
                "B789456", 19.27, 78);
        //Brutto Gehalt
        officeWorker2.paySlipGross();


        //Unternehmens Stamm
        Companies companies1 = new Companies("WHO", "NY CITY", 1945, "All nations");
        companies1.printTheBaseData();

        //Unternehmen
        Company company1 = new Company("TTT", "NYC Street", 1960, "Olaf", 500000000,
                10000000000.0, 100);
        //Mitarbeiter hinzufügen ins Unternehmen
        company1.addOfficeWorker(officeWorker1);
        company1.addOfficeWorker(officeWorker2);
        company1.printYourEmployee();

        SoccerClub soccerClub1 = new SoccerClub("Barca", "Street", 1902, "Barcelona City",
                50, 100000000, 50);
        //Spieler hinzufügen
        soccerClub1.addSoccer(soccers1);
        soccerClub1.addSoccer(forward1);
        soccerClub1.addSoccer(goalKeeper1);
        //Spieler Daten aller Spieler
        soccerClub1.printAllSoccer();
    }
}
