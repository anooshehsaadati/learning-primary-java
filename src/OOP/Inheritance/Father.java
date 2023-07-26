package OOP.Inheritance;

public class Father extends GrandFather {
    @Override
    public void showBehavior() {
        String behavior = "Well-behaved";
        System.out.println("Behavior: " + behavior);
    }

    @Override
    public void showCreativity() {
        String creativity = "Creative";
        System.out.println("Creativity: " + creativity);
    }

    public void showEducation() {
        String education = "BA";
        System.out.println("Education: " + education);
    }

    public void showStudyTime() {
        String studyTime = "Much";
        System.out.println("Study Time: " + studyTime);
    }
}
