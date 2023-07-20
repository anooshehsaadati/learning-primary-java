import java.util.Scanner;

public class MyFinancialTurnover {
    public static void main(String[] args) {
        System.out.println("My Financial Turnover");
        Scanner myScanner = new Scanner(System.in);
        // Variables
        int monthlyIncome, loanPayment, currentExpenses;

        // Monthly income input
        System.out.println("Please enter your monthly income:");
        monthlyIncome = myScanner.nextInt();

        // Loan Payment and current expenses input
        System.out.println("Please enter your loan payment and current expenses:");
        loanPayment = myScanner.nextInt();
        currentExpenses = myScanner.nextInt();

        // res of money calculated
        int result = monthlyIncome - (loanPayment + currentExpenses);
        System.out.println("The left over money equals to: " + result);

        myScanner.close();
    }
}
