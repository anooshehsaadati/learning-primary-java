package OOP.Method;

public class MethodIntro {
    int price = 1000;
    String laptopName = "ASUS ZenBook";
    public void showData() {
        System.out.println("Name of laptop is " + laptopName + " and its price is " + price + "$");
    }

    String sentence = "Dear son go to supermarket and also buy some ";
    public void goToSuperMarket(String something) {
        System.out.println(sentence + something);
    }

    public int goToComputerComplex() {
        int laptopPrice = 1000;
        return laptopPrice;
    }
}
