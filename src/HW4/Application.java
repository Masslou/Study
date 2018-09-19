package HW4;

import HW4.passengers.Dog;
import HW4.passengers.Human;
import HW4.roadtraffic.Bus;
import HW4.roadtraffic.BusStation;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Bus bus = new Bus();

        BusStation busStation1 = new BusStation("Ostrovskogo");
        BusStation busStation2 = new BusStation("CUM");
        BusStation busStation3 = new BusStation("Gogolya");
        BusStation busStation4 = new BusStation("Pamyatnik slavi");
        BusStation busStation5 = new BusStation("Ending station");


        Human passenger1 = new Human("Roman");
        Dog dog = new Dog("Poppy");

        Human passenger2 = new Human("Alex");
        Human passenger3 = new Human("Ivan");
        Human passenger4 = new Human("Pavel");
        Human passenger5 = new Human("Nico");

        List<Human> passengers = new ArrayList();

        bus.moveAndStop(busStation1);
        passenger1.takeDog(dog);
        bus.passengersComeIn(passenger1);
        bus.move(busStation2);
        bus.move(busStation3);
        bus.move(busStation4);
        bus.stop(busStation4);
        bus.passengersOut(passenger1);
        passengers.add(passenger2);
        passengers.add(passenger3);
        passengers.add(passenger4);
        passengers.add(passenger5);
        bus.passengersComeIn(passengers);
        bus.moveAndStop(busStation5);
        bus.passengersOut(passengers);
        passengers.clear();


    }
}