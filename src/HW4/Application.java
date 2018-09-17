package HW4;

import HW4.passangers.Dog;
import HW4.passangers.Human;
import HW4.roadtraffic.Bus;
import HW4.roadtraffic.BusStation;

public class Application {
    public static void main(String[] args) {

        BusStation busStation1 = new BusStation("Ostrovskogo");
        BusStation busStation2 = new BusStation("CUM");
        BusStation busStation3 = new BusStation("Gogolya");
        BusStation busStation4 = new BusStation("Pamyatnik slavi");
        BusStation busStation5 = new BusStation("Островского");


        Human passanger1 = new Human("Roman");
        Human passanger2 = new Human("Alex");
        Human passanger3 = new Human("Ivan");
        Human passanger4 = new Human("Pavel");
        Human passanger5 = new Human("Nico");

        Human[] humans = new Human []{
            passanger1, passanger2, passanger3, passanger4, passanger5
        } ;



        Bus bus = new Bus();


        bus.move(busStation1);
        bus.passangersComeIn(humans);


//        Dog dog = new Dog();

//        passanger1.takeDog(dog);
    }
}
