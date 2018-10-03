package homework.hw5.car;

public class Prado extends Toyota {

    public Prado(boolean fourWheelDrive, int speed, String transmissionType, String model) {
        super(fourWheelDrive, speed, transmissionType, model);
    }

    public Prado() {
        System.out.println("Конструктор класса PRADO");
    }


    public void switchFourWheelDriveOption() {
        fourWheelDrive = true;
        System.out.println(String.format("Toyota %s 4x4 option activated", Prado.class.getSimpleName()));
    }

}