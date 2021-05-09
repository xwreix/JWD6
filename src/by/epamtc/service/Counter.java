package by.epamtc.service;

import by.epamtc.entity.Aircraft;
import by.epamtc.entity.Airline;

import java.util.List;

public class Counter {
    public static int countTotalParameter(Airline airline, Countable parameter) {
        List<Aircraft> aircrafts = airline.getAircrafts();
        int total = 0;

        for (Aircraft aircraft : aircrafts) {
            total += parameter.getCurrent(aircraft);
        }

        return total;
    }

    public static class TotalLiftingCapacity implements Countable {
        @Override
        public int getCurrent(Aircraft aircraft) {
            return aircraft.getLiftingCapacity();
        }
    }

    public static class TotalSeatingCapacity implements Countable {
        @Override
        public int getCurrent(Aircraft aircraft) {
            return aircraft.getSeatingCapacity();
        }
    }
}

