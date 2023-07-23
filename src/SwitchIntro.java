import java.util.Scanner;

public class SwitchIntro {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Please enter the number of your birth month: ");
        if (keyboardInput.hasNextInt()){
            int monthNumber = keyboardInput.nextInt();
            switch (monthNumber) {
                case 1:
                    System.out.println("You were born in Farvardin.");
                    break;
                case 2:
                    System.out.println("You were born in Ordibehesht.");
                    break;
                case 3:
                    System.out.println("You were born in Khordad.");
                    break;
                case 4:
                    System.out.println("You were born in Tir.");
                    break;
                case 5:
                    System.out.println("You were born in Mordad.");
                    break;
                case 6:
                    System.out.println("You were born in Shahrivar.");
                    break;
                case 7:
                    System.out.println("You were born in Mehr.");
                    break;
                case 8:
                    System.out.println("You were born in Aban.");
                    break;
                case 9:
                    System.out.println("You were born in Azar.");
                    break;
                case 10:
                    System.out.println("You were born in Dey.");
                    break;
                case 11:
                    System.out.println("You were born in Bahman.");
                    break;
                case 12:
                    System.out.println("You were born in Esfand.");
                    break;
                default:
                    System.out.println("Wrong number of month!");
            }
        }else {
            System.out.println("Sorry, please enter the correct format!");
        }
        keyboardInput.close();
    }
}
