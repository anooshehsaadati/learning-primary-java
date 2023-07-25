import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        String[] castNames = new String[6];
        castNames[0] = "Zareyee Merila";
        castNames[1] = "Hosseini Shahab";
        castNames[2] = "Bayat Sareh";
        castNames[3] = "Moadi Peyman";
        castNames[4] = "Hatami Leila";
        castNames[5] = "Farhadi Sarina";
        for (int i = 0; i < castNames.length; i++) {
            System.out.println((i+1) + ": " + castNames[i]);
        }
        System.out.println("\n" + "Sort the arrays: ");
        Arrays.sort(castNames);
        for (int i = 0; i < castNames.length; i++) {
            System.out.println((i+1) + ": " + castNames[i]);
        }
    }
}
