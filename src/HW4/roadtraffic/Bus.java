package HW4.roadtraffic;

import HW4.passengers.Human;

import java.util.ArrayList;
import java.util.List;

/**
 * This class use for work with object Bus
 */

public class Bus {

    public static final int COUNT_OF_SEATS = 30;

    private List<Human> passengers = new ArrayList<>();

    /**
     * Use this method when we need to take bus on the next point of route
     *
     * @param station use object BusStation
     */

    public void move(BusStation station) {
        System.out.println(String.format("Bus start move to %s station", station.getStationName()));
    }

    /**
     * Use this method when we need to stop bus on the next point
     *
     * @param station use object BusStation
     */
    public void stop(BusStation station) {
        System.out.println(String.format("Bus stopped at the %s station", station.getStationName()));
    }

    /**
     * Use this method when we haven't another action before start and stop
     *
     * @param station use object BusStation
     */
    public void moveAndStop(BusStation station) {
        System.out.println(String.format("Bus start move to %s station", station.getStationName()));
        System.out.println(String.format("Bus stopped at the %s station", station.getStationName()));
    }

    /**
     * Use this method after method bus.stop when we have to add more than one passenger to bus
     *
     * @param passengers use object Human
     */
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

    /**
     * Use this method after method bus.stop when we have to add just one passenger to bus
     *
     * @param passenger use object Human
     */
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

    /**
     * Use this method after bus.stop when more than one passenger must out
     *
     * @param passengers use object Human
     */

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

    /**
     * Use this method after bus.stop when just one passenger must out
     *
     * @param passenger use object Human
     */
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