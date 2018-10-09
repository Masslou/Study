package homework.hw5.car;

public class Toyota extends Car {


    protected static final String MANUFACTURER_NAME = "Toyota";

    protected String carInformation = String.format("%s %s", MANUFACTURER_NAME, this.getClass().getSimpleName());

    public Toyota(boolean fourWheelDrive, int speed, String transmissionType, String model) {
        super(fourWheelDrive, speed, transmissionType, model);
    }

    public Toyota(int speed, String transmissionType, String model) {
        super(speed, transmissionType, model);
    }


    public Toyota() {
        super();
    }

    @Override
    public void start() {
        System.out.println(String.format("%s go", MANUFACTURER_NAME));
    }

    @Override
    public void stop() {
        System.out.println(String.format("%s stop", MANUFACTURER_NAME));
    }
}