package homework.hw5.car;

public class Toyota extends Car {

    protected static final String MANUFACTURER_NAME = "Toyota";

    public Toyota(boolean fourWheelDrive, int speed, String transmissionType, String model) {
        super(fourWheelDrive, speed, transmissionType, model);
    }

    public Toyota() {
        System.out.println();
    }

    @Override
    public void start() {
        System.out.println("Toyota go");
    }
}