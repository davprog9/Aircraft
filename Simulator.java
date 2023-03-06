// David Arzumanyan
//package org.example;

import java.util.ArrayList;

public class Simulator {

    public static void main(String[] args) {

        // Creating spaces for 5 aircraft
        ArrayList<Aircraft> aircraft = new ArrayList<Aircraft>(5);

        // Declaring all aircraft
        aircraft.add(new Airplane(130));
        aircraft.add(new Airplane(250));
        aircraft.add(new Helicopter(5));
        aircraft.add(new Helicopter(4));
        aircraft.add(new Helicopter(6));


        // Printing all information about the aircraft and its movements

        for (Aircraft aircraft_object : aircraft){

            System.out.println(aircraft_object.toString());
            aircraft_object.take_off(80,5,1456,-78623);
            aircraft_object.fly(200);
            aircraft_object.land(35,2,87567,-2989);
            System.out.println("");
        }

    }
}