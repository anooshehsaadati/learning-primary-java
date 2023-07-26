package OOP.Inheritance;

public class InheritanceOfChildren {
    public static void main(String[] args) {
        GrandFather grandFatherObj = new GrandFather();
        System.out.println("GrandFather details:");
        grandFatherObj.showHeight();
        grandFatherObj.showSkinColor();
        grandFatherObj.showBaldness();
        grandFatherObj.showBehavior();
        grandFatherObj.showCreativity();
        grandFatherObj.showActivity();
        grandFatherObj.showNationality();

        Father fatherObj = new Father();
        System.out.println("\n" + "Father details:");
        fatherObj.showHeight();
        fatherObj.showSkinColor();
        fatherObj.showBaldness();
        fatherObj.showBehavior();
        fatherObj.showCreativity();
        fatherObj.showActivity();
        fatherObj.showNationality();
        fatherObj.showEducation();
        fatherObj.showStudyTime();

        Son sonObj = new Son();
        System.out.println("\n" + "Son details:");
        sonObj.showHeight();
        sonObj.showSkinColor();
        sonObj.showBaldness();
        sonObj.showBehavior();
        sonObj.showCreativity();
        sonObj.showActivity();
        sonObj.showNationality();
        sonObj.showEducation();
        sonObj.showStudyTime();
    }
}
