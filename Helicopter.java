// David Arzumanyan
package org.example;

public class Helicopter extends Aircraft{

    private final int seats_capacity;

    /**
     * Default constructor
     * @author David Arzumanyan
     */
    public Helicopter(){
        super();
        this.seats_capacity = -1;
    }

    /**
     * Main constructor with the following parameters`
     * @param seats_capacity defines the number of seats in the aircraft
     * @author David Arzumanyan
     */
    public Helicopter(int seats_capacity, String name_of_aircraft){
        super("Helicopter", name_of_aircraft);
        this.seats_capacity = seats_capacity;
    }

    /**
     * Getter for seats capacity
     * @return Returns data type int
     * @author David Arzumanyan
     */
    public int getSeats_capacity() {
        return seats_capacity;
    }

    /**
     * Overriding the fly from interface Flyable
     * @param speed defines the speed
     * @author David Arzumanyan
     */
    @Override
    public void fly(int speed){
        System.out.println("The " + getType_of_aircraft() + " is flying with " + speed + "mph!");
    }


    /**
     * Overriding the takeoff from interface Flyable
     * @param speed defines the speed during/before takeoff
     * @param distance defines the distance for the takeoff
     * @param vertical_cord defines the vertical coordinate for takeoff
     * @param horizontal_cord defines the horizontal coordinate for takeoff
     */
    @Override
    public void take_off(int speed, int distance, int vertical_cord, int horizontal_cord){
        System.out.println("Taking off the " + getType_of_aircraft() + " with a speed " + speed + "mph in " + distance + " miles. | Coordinates (" + vertical_cord + ":" + horizontal_cord + ")");
    }


    /**
     * Overriding the land from interface Flyable
     * @param speed defines the speed during/before landing
     * @param distance defines the distance for landing
     * @param vertical_cord defines vertical coordinates for landing
     * @param horizontal_cord defines horizontal coordinates for landing
     */
    public void land(int speed, int distance, int vertical_cord, int horizontal_cord){
        System.out.println("Landing the " + getType_of_aircraft() + " in " + distance + " miles | Coordinates (" + vertical_cord + ":" + horizontal_cord + ")");
    }

    /**
     * toString for the class
     * @return Returns data type String
     * @author David Arzumanyan
     */
    public String toString(){
        return "Type of aircraft: " + getType_of_aircraft() + " Name of aircraft: " + this.name_of_aircraft + " Seats capacity: " + this.seats_capacity;
    }

}
