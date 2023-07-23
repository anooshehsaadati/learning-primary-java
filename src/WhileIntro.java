public class WhileIntro {
    public static void main(String[] args) {
        // while
        System.out.println("Intro of While: ");
        int number = 1;
        while (number <= 10) {
            System.out.println("My Number is " + number);
            number++;
        }

        // do ... while
        System.out.println("\nIntro of do...while: ");
        int count = 1;
        do{
            System.out.println("My Count is " + count);
            count++;
        } while (count <= 10);

        // diff of while and do...while
        System.out.println("\nDiff of While and do...while: ");
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

        // break and continue
        System.out.println("\nBreak and Continue: ");
        int num = 0;
        while (num < 1000) {
            num += 100;
            if (num == 300) {
                continue; // skip this iteration
            }
            System.out.println("My Number Is: " + num);
            if (num == 700) {
                break; // finish all iteration
            }
        }
    }
}
