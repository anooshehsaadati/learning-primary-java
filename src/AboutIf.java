public class AboutIf {
    public static void main(String[] args) {
        int waterAmount = 11;
        if (waterAmount < 20) {
            System.out.println("Go and buy some water!");
        }
        if (waterAmount <= 11) {
            System.out.println("Go and buy some water!");
        }
        if (waterAmount == 11) {
            System.out.println("We don't need water!");
        }
        if (waterAmount != 100) {
            System.out.println("The amount of water does not equal to 100");
        }
    }
}
