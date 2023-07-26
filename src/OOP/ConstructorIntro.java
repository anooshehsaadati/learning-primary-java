package OOP;

public class ConstructorIntro {
    String name;
    int age;
    boolean flag;
    ConstructorIntro(String name, int age, boolean flag) {
        this.name = name;
        this.age = age;
        this.flag = flag;
    }
    public void displayDetails() {
        System.out.println("Name is " + name);
        System.out.println("Age is " + age);
        System.out.println("Flag is " + flag);
    }
}
