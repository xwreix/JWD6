package by.epamtc.entity.plane;

import by.epamtc.entity.Aircraft;

public abstract class Plane extends Aircraft {
    private final double wingSpan;
    private final double interiorWidth;
    private final double takeoffRun;

    public Plane(int liftingCapacity, int seatingCapacity, int fuelConsumption,
                 int maxSpeed, double wingSpan, double interiorWidth, double takeoffRun) {
        super(liftingCapacity, seatingCapacity, fuelConsumption, maxSpeed);
        this.wingSpan = wingSpan;
        this.interiorWidth = interiorWidth;
        this.takeoffRun = takeoffRun;
    }

    public double getWingSpan() {
        return wingSpan;
    }

    public double getInteriorWidth() {
        return interiorWidth;
    }

    public double getTakeoffRun() {
        return takeoffRun;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Plane plane = (Plane) o;
        return plane.wingSpan == wingSpan &&
                plane.interiorWidth == interiorWidth &&
                plane.takeoffRun == takeoffRun;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = (int) (super.hashCode() + 31 * wingSpan + 32 * interiorWidth + 33 * takeoffRun);
        return result;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "liftingCapacity=" + super.getLiftingCapacity() +
                ", seatingCapacity=" + super.getSeatingCapacity() +
                ", fuelConsumption=" + super.getFuelConsumption() +
                ", maxSpeed=" + super.getMaxSpeed() +
                "wingSpan=" + wingSpan +
                ", interiorWidth=" + interiorWidth +
                ", takeoffRun=" + takeoffRun +
                '}';
    }
}
