package homework.hw5.car;

public class Camry extends Toyota {

    public Camry(boolean fourWheelDrive, int speed, String transmissionType, String model) {
        super(fourWheelDrive, speed, transmissionType, model);
    }

    public void switchOnTurbo() {

        super.modelModification = "sport";
        System.out.println(String.format("Toyota %s modification is %s. Turbo mode switch on.", Camry.class.getSimpleName(), super.modelModification));
    }

    @Override
    public void switchSpeedUp() {
        System.out.println(String.format("Speed switch up on Toyota Camry by %s transmission", transmissionType));
    }
}