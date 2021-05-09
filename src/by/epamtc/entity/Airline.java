package by.epamtc.entity;

import by.epamtc.exception.NoSuchAircraftException;
import by.epamtc.exception.NullAircraftException;
import by.epamtc.exception.WrongRangeException;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Airline {
    private List<Aircraft> aircrafts;

    public Airline() {
        aircrafts = new ArrayList<>();
    }

    public Airline(List<Aircraft> list) {
        aircrafts = list;
    }

    public List<Aircraft> getAircrafts() {
        return new ArrayList<>(aircrafts);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;

        boolean result = true;
        int i = 0;

        while (result) {
            if (!aircrafts.get(i).equals(airline.getAircrafts().get(i))) {
                result = false;
            } else {
                i++;
            }
        }

        return result;
    }

    @Override
    public int hashCode() {
        int result = 0;

        for (Aircraft aircraft : aircrafts) {
            result += aircraft.hashCode();
        }

        return result;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "aircrafts=" + aircrafts +
                '}';
    }

    public void add(Aircraft aircraft) throws NullAircraftException {
        if (aircraft == null) {
            throw new NullAircraftException("You can't add null aircraft");
        }

        aircrafts.add(aircraft);
    }

    public void delete(Aircraft aircraft) throws NullAircraftException {
        if (aircraft == null) {
            throw new NullAircraftException("You can't delete null aircraft");
        }

        aircrafts.remove(aircraft);
    }

    public void sort(Comparator<Aircraft> parameter) {
        aircrafts.sort(parameter);
    }

    public Aircraft findAppropriateAircraft(int bottom, int upper) throws WrongRangeException, NoSuchAircraftException {
        if (bottom > upper) {
            throw new WrongRangeException("You entered a wrong range");
        }

        for (Aircraft aircraft : aircrafts) {
            if (aircraft.getFuelConsumption() >= bottom && aircraft.getFuelConsumption() <= upper) {
                return aircraft;
            }
        }

        throw new NoSuchAircraftException("There is no aircraft with fuel consumption in this range");
    }

    public static class seatingCapacityComparator implements Comparator<Aircraft> {
        @Override
        public int compare(Aircraft o1, Aircraft o2) {
            return o1.getSeatingCapacity() - o2.getSeatingCapacity();
        }
    }

    public static class liftingCapacityComparator implements Comparator<Aircraft> {
        @Override
        public int compare(Aircraft o1, Aircraft o2) {
            return o1.getLiftingCapacity() - o2.getLiftingCapacity();
        }
    }

    public static class LiftingAndSeatingCapacityComparator implements Comparator<Aircraft> {
        @Override
        public int compare(Aircraft o1, Aircraft o2) {
            int result = o1.getSeatingCapacity() - o2.getSeatingCapacity();
            if (result == 0) {
                result = o1.getLiftingCapacity() - o2.getLiftingCapacity();
            }
            return result;
        }
    }
}


class seatingCapacityComparator implements Comparator<Aircraft> {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getSeatingCapacity() - o2.getSeatingCapacity();
    }
}

class liftingCapacityComparator implements Comparator<Aircraft> {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return o1.getLiftingCapacity() - o2.getLiftingCapacity();
    }
}

class LiftingAndSeatingCapacityComparator implements Comparator<Aircraft> {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        int result = o1.getSeatingCapacity() - o2.getSeatingCapacity();
        if (result == 0) {
            result = o1.getLiftingCapacity() - o2.getLiftingCapacity();
        }
        return result;
    }
}
