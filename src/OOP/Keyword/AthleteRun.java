package OOP.Keyword;

public class AthleteRun {
    public static void main(String[] args) {
        // 3 instance of Athlete
        Athlete person1 = new Athlete("Anushe", "Saadati", 1378);
        person1.showInfo();
        Athlete person2 = new Athlete("Mhmdreza", "Jafaei", 1378);
        person2.showInfo();
        Athlete person3 = new Athlete("Ali", "Ezati", 1376);
        person3.showInfo();

        // no change in registrationNumber
        person1.showInfo();
        person2.showInfo();
        person3.showInfo();

        // number of Athletes
//        System.out.println("The number of all registrations is " + person1.showAllAthlete()); // this is true but because of static method we can call with Class name
        System.out.println("The number of all registrations is " + Athlete.showAllAthlete());
    }
}
