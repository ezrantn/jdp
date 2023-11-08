package BuilderPattern.Builders;

import BuilderPattern.Cars.CarType;
import BuilderPattern.Components.Engine;
import BuilderPattern.Components.GPSNavigator;
import BuilderPattern.Components.Transmission;
import BuilderPattern.Components.TripComputer;

public interface Builders {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
