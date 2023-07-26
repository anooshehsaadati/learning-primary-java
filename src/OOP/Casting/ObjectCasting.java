package OOP.Casting;

import java.util.Scanner;

public class ObjectCasting {
    public static void main(String[] args) {
        // Casting Integer to int
        Integer intObj = new Integer(123);
        int intValue = intObj.intValue();
        System.out.println("Object is " + intObj);
        System.out.println("Casting to Value is " + intValue);

        // Calculate age and Casting String to int
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Please enter your name");
        System.out.print("My name is ");
        String name = keyboardInput.next();
        System.out.print("I was born in ");
        String date = keyboardInput.next();
        int intDate = Integer.parseInt(date);
        int age = 1402-intDate;
        System.out.println("Dear " + name + " you are " + age + " years old.");
        keyboardInput.close();
    }
}
