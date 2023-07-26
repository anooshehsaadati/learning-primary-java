package OOP.Keyword;

public class Athlete {
    static int registrationNumber;
    String name;
    String lastName;
    int dateOfBirth;

    public Athlete(String name, String lastName, int dateOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        registrationNumber++;
    }

    public void showInfo() {
        System.out.println("Your name is " + name);
        System.out.println("Your last name is " + lastName);
        System.out.println("Your date of birth is " + dateOfBirth);
        System.out.println("Your registration No is " + registrationNumber);
    }

    public static int showAllAthlete() {
        return registrationNumber;
    }
}
