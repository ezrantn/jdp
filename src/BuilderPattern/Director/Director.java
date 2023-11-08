package BuilderPattern.Director;

import BuilderPattern.Builders.Builders;
import BuilderPattern.Cars.CarType;
import BuilderPattern.Components.Engine;
import BuilderPattern.Components.GPSNavigator;
import BuilderPattern.Components.Transmission;
import BuilderPattern.Components.TripComputer;

public class Director {
    public void constructSportsCar(Builders builders) {
        builders.setCarType(CarType.SPORTS_CAR);
        builders.setSeats(2);
        builders.setEngine(new Engine(3.0, 0));
        builders.setTransmission(Transmission.SEMI_AUTOMATIC);
        builders.setTripComputer(new TripComputer());
        builders.setGPSNavigator(new GPSNavigator());
    }

    public void constructorCityCar(Builders builders) {
        builders.setCarType(CarType.CITY_CAR);
        builders.setSeats(2);
        builders.setEngine(new Engine(1.2, 0));
        builders.setTransmission(Transmission.AUTOMATIC);
        builders.setTripComputer(new TripComputer());
        builders.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builders builders) {
        builders.setCarType(CarType.SUV);
        builders.setSeats(4);
        builders.setEngine(new Engine(2.5, 0));
        builders.setTransmission(Transmission.MANUAL);
        builders.setGPSNavigator(new GPSNavigator());
    }
}
