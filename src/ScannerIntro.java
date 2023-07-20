import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Who are you?");
        String userInput = myScanner.nextLine();
        System.out.println("user input this: " + userInput);
        myScanner.close();
    }
}