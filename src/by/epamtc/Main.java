package by.epamtc;

import by.epamtc.entity.Airline;
import by.epamtc.exception.NoSuchAircraftException;
import by.epamtc.exception.NullAircraftException;
import by.epamtc.exception.WrongRangeException;
import by.epamtc.factory.AircraftFactory;
import by.epamtc.service.Counter;
import by.epamtc.service.DataScanner;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Airline airline = createAirline();
        System.out.println(airline + "\n\n");
        System.out.println("Total lifting capacity is " +
                Counter.countTotalParameter(airline, new Counter.TotalLiftingCapacity()));
        System.out.println("Total seating capacity is " +
                Counter.countTotalParameter(airline, new Counter.TotalSeatingCapacity()) + "\n");

        System.out.println("Sorted by lifting:");
        airline.sort(new Airline.liftingCapacityComparator());
        System.out.println(airline + "\n");

        System.out.println("Sorted by seating and lifting:");
        System.out.println(new Airline.LiftingAndSeatingCapacityComparator());
        System.out.println(airline + "\n");


        try {
            int[] range = DataScanner.rangeFromFile(new File("range.txt"));
            System.out.println("Appropriate aircraft ");
            System.out.println(airline.findAppropriateAircraft(range[0], range[1]));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (WrongRangeException | NoSuchAircraftException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Airline createAirline() {
        Airline airline = new Airline();
        AircraftFactory factory = new AircraftFactory();
        try {
            airline.add(factory.createAircraft(new AircraftFactory.createRobinsonR66()));
            airline.add(factory.createAircraft(new AircraftFactory.createAirbusA330()));
            airline.add(factory.createAircraft(new AircraftFactory.createBell407()));
            airline.add(factory.createAircraft(new AircraftFactory.createSikorskyS92()));
            airline.add(factory.createAircraft(new AircraftFactory.createTY154()));
            airline.add(factory.createAircraft(new AircraftFactory.createBoeing737()));
            airline.add(factory.createAircraft(new AircraftFactory.createTY154()));
            airline.add(factory.createAircraft(new AircraftFactory.createAirbusA330()));
        } catch (NullAircraftException e) {
            e.printStackTrace();
        }

        return airline;
    }
}
