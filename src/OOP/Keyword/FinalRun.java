package OOP.Keyword;

public class FinalRun {
    public static void main(String[] args) {
        WhatIsFinal obj1 = new WhatIsFinal();
        obj1.showData();

        FinalSubClass obj2 = new FinalSubClass();
        obj2.showData();

        // final for attribute write capital
        final int NUMBER_OF_HOURS_IN_A_DAY = 24;
        System.out.println(NUMBER_OF_HOURS_IN_A_DAY);
    }
}
