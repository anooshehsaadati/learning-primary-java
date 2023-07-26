package OOP.Keyword;

//public final class WhatIsFinal { // if add final keyword to class we can't use inheritance
public class WhatIsFinal {
//    public final void showData() { // if add final keyword to method we can't override method
    public void showData() {
        String name = "Anushe";
        String lastName = "Saadati";
        int dateOfBirth = 1378;
        System.out.println(name + "\n" + lastName + "\n" + dateOfBirth);
    }
}
