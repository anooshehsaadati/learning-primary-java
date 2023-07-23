public class WhileIntro {
    public static void main(String[] args) {
        // while
        int number = 1;
        while (number <= 10) {
            System.out.println("My Number is " + number);
            number++;
        }

        // do ... while
        int count = 1;
        do{
            System.out.println("My Count is " + count);
            count++;
        } while (count <= 10);

        // diff of while and do...while
        System.out.println("Diff of While and do...while: ");
        int number_diff = 12;
        while (number_diff <= 10) {
            System.out.println("My Number is " + number_diff);
            number_diff++;
        }
        int count_diff = 12;
        do{
            System.out.println("My Count is " + count_diff);
            count_diff++;
        } while (count_diff <= 10);
    }
}
