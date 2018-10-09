package homework.hw5;

import homework.hw5.car.*;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        String delimiter = "------------------------------------------------------------";

        Car prado = new Prado(false, 220, Transmission.AUTOMATIC, "Allroad");
        Car camry = new Camry(280, Transmission.MANUAL, "Sport");

        System.out.println("REFLECTION:");

        Class c = Class.forName(Car.class.getName());
        Object object = c.newInstance();
        System.out.println(delimiter);


        ArrayList<Car> listCars = new ArrayList<>();

        listCars.add(prado);
        listCars.add(camry);
        listCars.add((Car) object);


        for (Car cars : listCars) {

            System.out.println(String.format("CARS ACTION: %s", cars.getClass().getSimpleName().toUpperCase()));

            cars.start();
            cars.switchSpeedUp();
            cars.switchSpeedDown();

            if (cars instanceof Prado) {
                ((Prado) prado).switchFourWheelDriveOption();

            } else if (cars instanceof Camry) {
                ((Camry) camry).switchOnTurbo();

            }

            cars.stop();
            System.out.println(delimiter);
        }
    }
}