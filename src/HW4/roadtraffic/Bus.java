package HW4.roadtraffic;

import HW4.passangers.Human;

public class Bus {

    public static final int COUNT_OF_SEATS = 30;


    public void move(BusStation station) {
        System.out.println(String.format("Bus start move to %s station", station.stationName));
    }

    public void stop(BusStation station) {
        System.out.println(String.format("Bus stop move to %s station", station.stationName));
    }

    public void passangersComeIn(Human[] passangers) {
        for (int i = 0; i < passangers.length; i++) {


            System.out.println(String.format("Passanger %s come in station", passangers[i].getName()));
        }
    }

    public void passangersOut(Human passangers) {
        System.out.println(String.format("Bus stop move to %s station", passangers.getClass().toString()));


    }


}
