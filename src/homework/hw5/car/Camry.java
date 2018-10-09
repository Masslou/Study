package homework.hw5.car;


public class Camry extends Toyota {


    public Camry(int speed, Transmission transmissionType, String model) {
        super(speed, transmissionType.name(), model);
    }

    public Camry() {
        super();
    }

    public void switchOnTurbo() {

        super.modelModification = "sport";
        System.out.println(String.format("%s modification is %s. Turbo mode switch on.", carInformation, modelModification));
    }

    @Override
    public void switchSpeedUp() {
        System.out.println(String.format("Speed switch up on %s Camry by %s transmission", MANUFACTURER_NAME, transmissionType));
    }


    @Override
    public void start() {
        System.out.println(String.format("%s %s start moving", carInformation, modelModification));
    }

    @Override
    public void stop() {
        System.out.println(String.format("%s stopping", carInformation));
    }
}