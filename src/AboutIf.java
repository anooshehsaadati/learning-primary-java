import java.util.Scanner;

public class AboutIf {
    public static void main(String[] args) {
        // Example 1 about amount of water
        int waterAmount = 11;
        if (waterAmount < 20) {
            System.out.println("Go and buy some water!");
        }
        if (waterAmount <= 11) {
            System.out.println("Go and buy some water!");
        }
        if (waterAmount == 11) {
            System.out.println("We don't need water!");
        }
        if (waterAmount != 100) {
            System.out.println("The amount of water does not equal to 100!");
        }

        // Example 2 about capacity of SUV and bus
        int suv = 4, bus = 40;
        if (suv < bus) {
            System.out.println("An SUV has less capacity.");
        }

        // Example 3 about Age
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        if (keyboardInput.hasNextInt()) {
            int boy = keyboardInput.nextInt();
            if (boy >= 18) {
                System.out.println("You have reached your majority.");
            } else {
                System.out.println("Sorry, you are too young!");
            }

            // Short form of if statement
            System.out.println(boy >= 18 ? "You have reached your majority." : "Sorry, you are too young!");
        } else {
            System.out.println("Sorry, please enter correct input!");
        }
    }
}
