package homework.hw5.car;

import java.util.Objects;

public class Car {

    protected boolean fourWheelDrive;
    protected int speed;
    protected String transmissionType;
    protected String modelModification;

    public Car(boolean fourWheelDrive, int speed, String transmissionType, String modelModification) {
        this.fourWheelDrive = fourWheelDrive;
        this.speed = speed;
        this.transmissionType = transmissionType;
        this.modelModification = modelModification;
    }

    public Car() {
        System.out.println("Конструктор класса CAR");
    }

    public void switchSpeedUp() {
        System.out.println("Switch speed up");
    }

    public void switchSpeedDown() {
        System.out.println("Switch speed down");
    }


    public void start() {
        System.out.println("Car move");
    }

    public void stop() {
        System.out.println("Car stop");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return fourWheelDrive == car.fourWheelDrive &&
                speed == car.speed &&
                Objects.equals(transmissionType, car.transmissionType) &&
                Objects.equals(modelModification, car.modelModification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fourWheelDrive, speed, transmissionType, modelModification);
    }

    @Override
    public String toString() {
        return "Car{" +
                "fourWheelDrive=" + fourWheelDrive +
                ", speed=" + speed +
                ", transmissionType='" + transmissionType + '\'' +
                ", modelModification='" + modelModification + '\'' +
                '}';
    }
}

