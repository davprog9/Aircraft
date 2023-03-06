// David Arzumanyan
//package org.example;

public abstract class Aircraft implements Flyable{

    private final String type_of_aircraft;

    /**
     * Default constructor
     * @author David Arzumanyan
     */
    public Aircraft(){
        this.type_of_aircraft = "N/A";
    }

    /**
     * Main constructor with the following parameter`
     * @param type_of_aircraft defines the type of the aircraft
     * @author David Arzumanyan
     */
    public Aircraft(String type_of_aircraft){
        this.type_of_aircraft = type_of_aircraft;
    }


    /**
     * Getter for the type of aircraft
     * @return Returns data type String
     * @author David Arzumanyan
     */
    public String getType_of_aircraft() {
        return type_of_aircraft;
    }

    // Below are methods from Flyable interface

    /**
     * Overriding the fly from interface Flyable
     * @param speed defines the speed
     * @author David Arzumanyan
     */
    @Override
    public void fly(int speed){
        System.out.println("The " + this.type_of_aircraft + " is flying with " + speed + "mph!");
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
        System.out.println("Taking off the " + this.type_of_aircraft + " with a speed " + speed + "mph in " + distance + " miles.\nCoordinates (" + vertical_cord + ":" + horizontal_cord + ")");
    }

    /**
     * Overriding the land from interface Flyable
     * @param speed defines the speed during/before landing
     * @param distance defines the distance for landing
     * @param vertical_cord defines vertical coordinates for landing
     * @param horizontal_cord defines horizontal coordinates for landing
     */
    public void land(int speed, int distance, int vertical_cord, int horizontal_cord){
        System.out.println("Landing the " + this.type_of_aircraft + " in " + distance + " miles\nCoordinates (" + vertical_cord + ":" + horizontal_cord + ")");
    }


    /**
     * toString for the class
     * @return Returns data type String
     * @author David Arzumanyan
     */
    @Override
    public String toString(){
        return "Type of aircraft: " + this.type_of_aircraft;
    }

}
