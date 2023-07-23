import java.util.Scanner;

public class StrInSwitch {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        if (keyboardInput.hasNext()){
            String cityName = keyboardInput.next();
            cityName = cityName.toLowerCase();
            switch (cityName) {
                case "mashhad":
                    System.out.println("Mashhad Code Is 051");
                    break;
                case "arak":
                    System.out.println("Arak Code Is 086");
                    break;
                case "abadan":
                    System.out.println("Abadan Code Is 061");
                    break;
                case "tehran":
                    System.out.println("Tehran Code Is 021");
                    break;
                case "amol":
                    System.out.println("Amol Code Is 011");
                    break;
                case "chabahar":
                    System.out.println("Chabahar Code Is 054");
                    break;
                case "sanandaj":
                    System.out.println("Sanandaj Code Is 087");
                    break;
                default:
                    System.out.println("Sorry, This City Is Not Defined!");
            }
        } else {
            System.out.println("Sorry, please enter correct format!");
        }
        keyboardInput.close();
    }
}
