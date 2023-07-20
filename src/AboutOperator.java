public class AboutOperator {
    public static void main(String[] args) {
        int studentNumber = 121;
        System.out.println("initial value of student number is " + studentNumber);
        // plus
        studentNumber = studentNumber + 10; // short for is studentNumber += 10
        System.out.println("plus 10 to student number is " + studentNumber);

        // minus
        studentNumber = studentNumber - 10; // short for is studentNumber -= 10
        System.out.println("minus 10 to student number is " + studentNumber);

        // multiply
        studentNumber = studentNumber * 10; // short for is studentNumber *= 10
        System.out.println("multiple 10 to student number is " + studentNumber);

        // division
        studentNumber = studentNumber / 100; // short for is studentNumber /= 100
        System.out.println("divide 100 to student number is " + studentNumber);

        // Incrementing and Decrementing
        studentNumber = 20;
        // Post-incrementing
        System.out.println("value of student Number is " + studentNumber);
        System.out.println("Post incrementing is " + studentNumber++);
        System.out.println("final value is " + studentNumber);

        // Pre-incrementing
        System.out.println("value of student Number is " + studentNumber);
        System.out.println("Pre incrementing is " + ++studentNumber);
        System.out.println("final value is " + studentNumber);

        // Post-decrementing
        System.out.println("value of student Number is " + studentNumber);
        System.out.println("Post decrementing is " + studentNumber--);
        System.out.println("final value is " + studentNumber);

        // Pre-decrementing
        System.out.println("value of student Number is " + studentNumber);
        System.out.println("Pre decrementing is " + --studentNumber);
        System.out.println("final value is " + studentNumber);

        System.out.println("\n");

        // Order of operator
        int x;
        int y = 10;
        x = y * 2 + 6;
        System.out.println("value of x if \"x = y * 2 + 6 is\" " + x);
        x = y * (2 + 6);
        System.out.println("value of x if \"x = y * (2 + 6)\" is " + x);
    }
}
