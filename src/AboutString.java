public class AboutString {
    public static void main(String[] args) {
        String myString = "My Name is Anushe";
        System.out.println(myString);

        System.out.println("My Name is Anushe");

        System.out.print("My First Name is Anushe, ");
        System.out.print("My Last Name is Saadati");

        System.out.print("\t \n");

        System.out.println("I Like the \"Java\" Programming Language");

        System.out.println("I like the \"Java\" Programming Language." +
                "This language is used to create android apps.");

        int studentNumber = 20;
        int teacherNumber = 6;
        System.out.println("The number of student is " + studentNumber);
        System.out.println("The number of teacher is " + teacherNumber);

        // Methods
        String firstName = "Anushe";
        String lastName = "Saadati";
        System.out.println("My First Name is " + firstName + " My Last Name is " + lastName
                + " And my firstname is equal to my lastname? "+ firstName.equals(lastName));

        String sentence = "This is a short sentence.";
        System.out.println("the length of sentence is " + sentence.length());

        System.out.println("lowercase of my name is " + firstName.toLowerCase() + " " + lastName.toLowerCase());
        System.out.println("uppercase of my name is " + firstName.toUpperCase() + " " + lastName.toUpperCase());
    }
}
