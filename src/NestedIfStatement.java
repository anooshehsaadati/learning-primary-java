import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args) {
        // Example 1 about percent of discount
        double intelligenceQuotient = 100;
        double termMean = 17.3;
        if (intelligenceQuotient > 110 && termMean > 18) {
            System.out.println("You have 30 percent discount.");
        } else if (intelligenceQuotient > 100 || termMean > 17) {
            System.out.println("You have 20 percent discount.");
        } else {
            System.out.println("You have no discount.");
        }

        // Example 2 about Age
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        if (keyboardInput.hasNextInt()) {
            int age = keyboardInput.nextInt();
            if (age > 40) {
                System.out.println("You are older than 40.");
            } else {
                System.out.println("You are not older than 40.");
                if (age < 20) {
                    System.out.println("You are under 20.");
                } else {
                    System.out.println("You are over 20.");
                }
            }
        }else {
            System.out.println("Sorry, your input has wrong format.");
        }
        keyboardInput.close();
    }
}
