package OOP;

public class FuelConstructor {
    String name;
    String carName;

    public FuelConstructor(String name, String carName) {
        this.name = name;
        this.carName = carName;
    }

    public String getName() {
        return name;
    }

    public String getCarName() {
        return carName;
    }
}
