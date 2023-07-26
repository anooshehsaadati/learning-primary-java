package OOP.Casting;

public class CastingIntro {
    public static void main(String[] args) {
        // double casting to int
        double doubleVar = 10.2;
        int intVar = (int) doubleVar;
        System.out.println("double: " + doubleVar);
        System.out.println("int: " + intVar);

        // int casting to short
        int integerVar = 1000000;
        short shortVar = (short) integerVar;
        System.out.println("int: " + integerVar);
        System.out.println("short: " + shortVar);
    }
}
