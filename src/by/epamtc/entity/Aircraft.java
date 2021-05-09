package by.epamtc.entity;

public abstract class Aircraft {
    private final int liftingCapacity;
    private final int seatingCapacity;
    private final int fuelConsumption;
    private final int maxSpeed;

    public Aircraft(int liftingCapacity, int seatingCapacity, int fuelConsumption,
                    int maxSpeed) {
        this.liftingCapacity = liftingCapacity;
        this.seatingCapacity = seatingCapacity;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    public int getLiftingCapacity() {
        return liftingCapacity;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return aircraft.liftingCapacity == liftingCapacity &&
                aircraft.seatingCapacity == seatingCapacity &&
                aircraft.fuelConsumption == fuelConsumption &&
                aircraft.maxSpeed == maxSpeed;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = (int) (31 * liftingCapacity + 32 * seatingCapacity
                + 33 * fuelConsumption + 34 * maxSpeed);
        return result;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "liftingCapacity=" + liftingCapacity +
                ", seatingCapacity=" + seatingCapacity +
                ", fuelConsumption=" + fuelConsumption +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
