public class NDimensionalArray {
    public static void main(String[] args) {
        // One Dimensional
        String[] emptyArray = {};
        System.out.println(emptyArray);
        System.out.println(emptyArray.length);

        String[] SomeItems = {"Bread", "Cheese", "Butter", "Tea", "Potato", "Tomato", "Onion", "Coffee", "Yogurt Drink", "Mineral Water"};
        System.out.println(SomeItems);
        System.out.println(SomeItems.length);
        System.out.println(SomeItems[2]);

        // Multi Dimensional
        int[][] emptyNumbers = {{}, {}};
        System.out.println(emptyNumbers);
        System.out.println(emptyNumbers.length);

        int[][] someNumbers = {{10, 20, 30}, {100, 200, 300}};
        System.out.println(someNumbers);
        System.out.println(someNumbers.length);
        System.out.println(someNumbers[0].length);
        System.out.println(someNumbers[0][1]);
    }
}
