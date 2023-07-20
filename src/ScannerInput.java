import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner keyboardInput;

        // nextLine() method
        keyboardInput = new Scanner(System.in);
        System.out.print("Please enter your input: ");
        System.out.println("your input is \"" + keyboardInput.nextLine() + "\"");

        // next() method
        keyboardInput = new Scanner(System.in);
        System.out.print("Please enter your input: ");
        System.out.println("your input is \"" + keyboardInput.next() + "\"");
        System.out.println("your input is \"" + keyboardInput.next() + "\"");

        // nextInt() method
        keyboardInput = new Scanner(System.in);
        System.out.print("Please enter your input: ");
        System.out.println("your input is \"" + keyboardInput.nextInt() + "\"");
        System.out.println("your input is \"" + keyboardInput.nextInt() + "\"");

        // nextDouble() method
        keyboardInput = new Scanner(System.in);
        System.out.print("Please enter your input: ");
        System.out.println("your input is \"" + keyboardInput.nextDouble() + "\"");
        System.out.println("your input is \"" + keyboardInput.nextDouble() + "\"");

        keyboardInput.close();
    }
}
