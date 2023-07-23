import java.util.Scanner;

public class HelpingMySibling {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Please enter first static number: ");
        if (keyboardInput.hasNextInt()) {
            int numberOne = keyboardInput.nextInt();
            System.out.print("Please enter second dynamic number: ");
            if (keyboardInput.hasNextInt()) {
                int numberTwo = keyboardInput.nextInt();
                int iterationOne;
                int iterationTwo;
                for (iterationOne = numberOne, iterationTwo = 1; iterationOne * iterationTwo <= numberOne * numberTwo; iterationTwo++){
                    System.out.println("The result of " + iterationOne + " * " + iterationTwo + " is " + (iterationOne * iterationTwo));
                }
            } else {
                System.out.println("Sorry, enter correct format!");
            }
        } else {
            System.out.println("Sorry, enter correct format!");
        }
        keyboardInput.close();
    }
}
