public class MonthlyPaymentAverage {
    public static void main(String[] args) {
        int[] monthPayment = new int[12];
        monthPayment[0] = 500;
        monthPayment[1] = 1500;
        monthPayment[2] = 1300;
        monthPayment[3] = 1700;
        monthPayment[4] = 2500;
        monthPayment[5] = 500;
        monthPayment[6] = 1500;
        monthPayment[7] = 1000;
        monthPayment[8] = 750;
        monthPayment[9] = 500;
        monthPayment[10] = 1400;
        monthPayment[11] = 1100;

        int totalPayment = 0;
        for (int i = 0; i < monthPayment.length; i++) {
            totalPayment += monthPayment[i];
        }
        System.out.println("Total Payment is " + totalPayment);

        double avgPayment = totalPayment / (float) monthPayment.length;
        System.out.println("Average Payment is " + avgPayment);
    }
}
