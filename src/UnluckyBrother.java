import java.util.Random;

public class UnluckyBrother {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int jackNumber, johnNumber;
        for (jackNumber = randomNumber.nextInt(101), johnNumber = randomNumber.nextInt(101); jackNumber <= 1000 || johnNumber <= 1000; jackNumber += randomNumber.nextInt(11), johnNumber += randomNumber.nextInt(11)) {
            System.out.println("Jack`s number is " + jackNumber + " and " + "John`s number is " + johnNumber);
        }
        if (jackNumber > johnNumber) {
            System.out.println("Jack won the game and John has to buy it.");
        } else if (jackNumber < johnNumber) {
            System.out.println("John won the game and Jack has to buy it.");
        } else {
            System.out.println("Now they have to think about a third solution!");
        }
    }
}
