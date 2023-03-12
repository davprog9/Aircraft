// David Arzumanyan
package org.example;

import java.util.ArrayList;
import java.util.Random;

public class Simulator {

    public static void main(String[] args) {

        // Creating spaces for 5 aircraft

        ArrayList<Aircraft> aircrafts = new ArrayList<Aircraft>(5);
        aircrafts.add(new Helicopter(6,"H155 Airbus"));
        aircrafts.add(new Helicopter(5,"Bell 212"));
        aircrafts.add(new Helicopter(8,"Agusta AW169"));
        aircrafts.add(new Airplane(400, "Airbus A300-600ST"));
        aircrafts.add(new Airplane(380, "Beluga"));

        Random random = new Random();

        // Printing all information about the aircraft and its movements

        for(int i = 0; i < 5; i++){
            Aircraft random_aircraft = aircrafts.get(random.nextInt(aircrafts.size()));
            System.out.println(random_aircraft.toString());
            random_aircraft.take_off(80,5,1456,-78623);
            random_aircraft.fly(200);
            random_aircraft.land(35,2,87567,-2989);
            System.out.println("");
        }



    }
}