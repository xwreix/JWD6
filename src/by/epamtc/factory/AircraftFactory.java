package by.epamtc.factory;

import by.epamtc.entity.*;
import by.epamtc.entity.helicopter.*;
import by.epamtc.entity.plane.*;

public class AircraftFactory {
    public Aircraft createAircraft(Creatable type){
        Aircraft aircraft = type.create();
        return aircraft;
    }

    public static class createBell407 implements Creatable {
        @Override
        public Aircraft create() {
            return new Bell407();
        }
    }

    public static class createRobinsonR66 implements Creatable{
        @Override
        public Aircraft create() {
            return new RobinsonR66();
        }
    }

    public static class createSikorskyS92 implements Creatable{
        @Override
        public Aircraft create() {
            return new SikorskyS92();
        }
    }

    public static class createAirbusA330 implements  Creatable{
        @Override
        public Aircraft create() {
            return new AirbusA330();
        }
    }

    public static class createBoeing737 implements Creatable{
        @Override
        public Aircraft create() {
            return new Boeing737();
        }
    }

    public static class createTY154 implements Creatable{
        @Override
        public Aircraft create() {
            return new TY154();
        }
    }

}



