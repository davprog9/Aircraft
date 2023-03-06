// David Arzumanyan
//package org.example;

public interface Flyable {

    /**
     * Method fly allows the aircraft to fly
     * @param speed defines the speed
     * @author David Arzumanyan
     */
    public void fly(int speed);

    /**
     * Method take off allows the aircraft to take off
     * @param speed defines the speed during/before takeoff
     * @param distance defines the distance for the takeoff
     * @param vertical_cord defines the vertical coordinate for takeoff
     * @param horizontal_cord defines the horizontal coordinate for takeoff
     * @author David Arzumanyan
     */
    public void take_off(int speed, int distance, int vertical_cord, int horizontal_cord);

    /**
     * Method land allows the aircraft the land
     * @param speed defines the speed during/before landing
     * @param distance defines the distance for landing
     * @param vertical_cord defines vertical coordinates for landing
     * @param horizontal_cord defines horizontal coordinates for landing
     * @author David Arzumanyan
     */
    public void land(int speed, int distance, int vertical_cord, int horizontal_cord);

}
