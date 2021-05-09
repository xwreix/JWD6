package by.epamtc.entity.helicopter;

import by.epamtc.entity.Aircraft;

public abstract class Helicopter extends Aircraft {
    private final double mainRotorDiameter;
    private final String powerPoint;
    private final double power;

    public Helicopter(int liftingCapacity, int seatingCapacity, int fuelConsumption,
                      int maxSpeed, double mainRotorDiameter, String powerPoint, double power) {
        super(liftingCapacity, seatingCapacity, fuelConsumption, maxSpeed);
        this.mainRotorDiameter = mainRotorDiameter;
        this.powerPoint = powerPoint;
        this.power = power;
    }

    public double getMainRotorDiameter() {
        return mainRotorDiameter;
    }

    public String getPowerPoint() {
        return powerPoint;
    }

    public double getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Helicopter that = (Helicopter) o;
        return that.mainRotorDiameter == mainRotorDiameter &&
                powerPoint.equals(that.powerPoint) &&
                that.power == power;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = (int) (super.hashCode() + 31 * mainRotorDiameter + 32 * power);
        return result;
    }

    @Override
    public String toString() {
        return "Helicopter{" +
                "liftingCapacity=" + super.getLiftingCapacity() +
                ", seatingCapacity=" + super.getSeatingCapacity() +
                ", fuelConsumption=" + super.getFuelConsumption() +
                ", maxSpeed=" + super.getMaxSpeed() +
                "mainRotorDiameter=" + mainRotorDiameter +
                ", powerPoint='" + powerPoint + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
