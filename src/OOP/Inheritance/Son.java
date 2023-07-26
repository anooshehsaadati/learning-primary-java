package OOP.Inheritance;

public class Son extends Father{
    @Override
    public void showHeight() {
        String height = "Tall";
        System.out.println("Height: " + height);
    }

    @Override
    public void showBaldness() {
        String baldness = "Not Bald";
        System.out.println("Baldness: " + baldness);
    }

    @Override
    public void showBehavior() {
        String behavior = "Angry";
        System.out.println("Behavior: " + behavior);
    }

    @Override
    public void showEducation() {
        String education = "MA";
        System.out.println("Education: " + education);
    }

    @Override
    public void showStudyTime() {
        String studyTime = "Very Much";
        System.out.println("Study Time: " + studyTime);
    }
}
