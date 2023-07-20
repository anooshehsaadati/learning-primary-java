public class ElevatorCapacity {
    public static void main(String[] args) {
        double avgWeightOfEachPerson = 75.5;
        int numberOfPeople = 16;
        double totalWeight = avgWeightOfEachPerson * numberOfPeople;
        double elevatorCapacity = 750;
        System.out.println(numberOfPeople + " people get on!");
        if (totalWeight <= elevatorCapacity) {
            System.out.println("The door can be closed!");
        } else {
            System.out.println("The number of people is more than the elevator capacity and " + "the door can't be closed.");
        }
    }
}