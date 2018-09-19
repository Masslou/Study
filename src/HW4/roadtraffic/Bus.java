package HW4.roadtraffic;

import HW4.passengers.Human;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    public static final int COUNT_OF_SEATS = 30;

    private List<Human> passengers = new ArrayList<>();

    public void move(BusStation station) {
        System.out.println(String.format("Bus start move to %s station", station.getStationName()));
    }

    public void stop(BusStation station) {
        System.out.println(String.format("Bus stopped at the %s station", station.getStationName()));
    }

    public void moveAndStop(BusStation station) {
        System.out.println(String.format("Bus start move to %s station", station.getStationName()));
        System.out.println(String.format("Bus stopped at the %s station", station.getStationName()));
    }

    public void passengersComeIn(List<Human> passengers) {
        for (int i = 0; i < passengers.size(); i++) {
            if (this.passengers.size() <= COUNT_OF_SEATS) {
                if (passengers.get(i).getTemplate() != null) {
                    this.passengers.add(passengers.get(i));
                    System.out.println(String.format("Passanger %s get on the bus", passengers.get(i).getName() + " with dog"));
                } else {
                    this.passengers.add(passengers.get(i));
                    System.out.println(String.format("Passanger %s get on the bus", passengers.get(i).getName()));
                }
            } else {
                System.out.println(String.format("Passanger %s stay wait next bus", passengers.get(i).getName()));
            }
        }
    }


    public void passengersComeIn(Human passenger) {
        if (this.passengers.size() <= COUNT_OF_SEATS) {
            if (passenger.getTemplate() == null) {
                System.out.println(String.format("Passenger %s get on the bus", passenger.getName()));
                this.passengers.add(passenger);
            } else {
                System.out.println(String.format("Passanger %s get on the bus", passenger.getName() + " with dog"));
                this.passengers.add(passenger);
            }
        }
    }

    public void passengersOut(List<Human> passengers) {
        for (Human passenger : passengers) {
            if (this.passengers.remove(passenger)) {
                if (passenger.getTemplate() != null) {
                    System.out.println(String.format("Passanger %s get off the bus", passenger.getName() + " with dog"));
                } else
                    System.out.println(String.format("Passanger %s get off the bus", passenger.getName()));
            }
        }
    }

    public void passengersOut(Human passenger) {
        if (this.passengers.remove(passenger)) {
            if (passenger.getTemplate() != null) {
                passengers.remove(passenger);
                System.out.println(String.format("Passanger %s get off the bus", passenger.getName() + " with dog"));
            } else {
                passengers.remove(passenger);
                System.out.println(String.format("Passanger %s get off the bus", passenger.getName()));
            }
        } else
            System.out.println(String.format("Passanger %s left bus earlier", passenger.getName()));
    }
}