import java.util.Scanner;

public class PassApp {
    public static void main(String[] args) {
        Scanner passwordInput = new Scanner(System.in);
        System.out.print("Please enter your password: ");
        int truePassword = 1234567890;
        if (passwordInput.hasNextInt() && passwordInput.nextInt() == truePassword){
            System.out.println("Thanks, you entered the right format and also your password is correct.");
        } else {
            System.out.println("Sorry, please enter the right format or the right password.");
        }
        passwordInput.close();
    }
}
