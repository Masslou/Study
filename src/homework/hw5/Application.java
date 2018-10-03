package homework.hw5;

import homework.hw5.car.*;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        Car prado = new Prado(false, 220, Transmission.AUTOMATIC.name(), "allroad");
        Car camry = new Camry(false, 280, Transmission.MANUAL.name(), "sport");
        Car pradoEmpty = new Prado();


        ArrayList<Car> listCars = new ArrayList<>();

        listCars.add(prado);
        listCars.add(camry);
        listCars.add(pradoEmpty);


        for (Car cars : listCars) {
            cars.start();
            cars.start();
            cars.switchSpeedDown();
            cars.switchSpeedUp();

            if (cars instanceof Prado) {
                ((Prado) prado).switchFourWheelDriveOption();

            }

            if (cars instanceof Camry) {
                ((Camry) camry).switchOnTurbo();

            }
        }
    }
}