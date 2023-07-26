package OOP;

import java.util.Scanner;

public class ConstructorRun {
    public static void main(String[] args) {
        ConstructorIntro constructorIntro = new ConstructorIntro("Anushe", 24, false);
        constructorIntro.displayDetails();

        // Fuel Consumption for Constructor
        FuelConstructor obj1 = new FuelConstructor("Anushe", "207");

        // with Keyboard Input
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = keyboardInput.next();
        System.out.print("Please enter your Car type: ");
        String carName = keyboardInput.next();
        FuelConstructor obj2 = new FuelConstructor(name, carName);

        System.out.print("How many kilometers did you go with your car: ");
        double distance = keyboardInput.nextDouble();
        System.out.print("How much petrol did your car use? ");
        double petrolUsed = keyboardInput.nextDouble();
        double result = 100*petrolUsed / distance;
        System.out.println("Dear " + obj2.getName() + ", your " + obj2.getCarName() + " car consumes " + Math.round(result) + " liters petrol in 100 kilometers.");
        keyboardInput.close();
    }
}
