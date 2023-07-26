package OOP.Method;

public class MethodMain {
    public static void main(String[] args) {
        MethodIntro methodIntro = new MethodIntro();
        methodIntro.showData();
        methodIntro.goToSuperMarket("Bread");
        int price = methodIntro.goToComputerComplex();
        System.out.println("Laptop price is " + price + "$");
    }
}
