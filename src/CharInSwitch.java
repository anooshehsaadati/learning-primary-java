import java.util.Scanner;

public class CharInSwitch {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Please choose which type of mail would you like? ");
        if (keyboardInput.hasNext()) {
            char typeChosen = keyboardInput.next().charAt(0);
            typeChosen = Character.toUpperCase(typeChosen);
            switch (typeChosen) {
                case 'A':
                    System.out.println("You will get your package via express mail and you have to pay to the postman.");
                    break;
                case 'B':
                    System.out.println("You will get your package via ordinary mail and you have to pay to the postman.");
                    break;
                case 'C':
                    System.out.println("You have to pay via Internet bank and download your software via Internet.");
                    break;
                default:
                    System.out.println("Sorry, It seems that there is a problem, please give it another try!");
            }
        } else {
            System.out.println("Please enter correct format!");
        }
        keyboardInput.close();
    }
}
