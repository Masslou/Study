package homework.hw5.car;

public class Prado extends Toyota {


    public Prado(boolean fourWheelDrive, int speed, Transmission transmissionType, String model) {
        super(fourWheelDrive, speed, transmissionType.name(), model);
    }

    public Prado() {
        super();
    }

    public void switchFourWheelDriveOption() {
        fourWheelDrive = true;
        System.out.println(String.format("%s 4x4 option activated", carInformation));
    }

    @Override
    public void start() {
        System.out.println(String.format("%s %s start moving ", carInformation, modelModification));
    }

    @Override
    public void stop() {
        System.out.println(String.format("%s stopping", carInformation));
    }

    @Override
    public void switchSpeedUp() {
        System.out.println(String.format("Speed switch up on %s Camry by %s transmission", MANUFACTURER_NAME, transmissionType));
    }
}