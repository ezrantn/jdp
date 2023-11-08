package BuilderPattern.App;

import BuilderPattern.Builders.CarBuilder;
import BuilderPattern.Builders.CarManualBuilder;
import BuilderPattern.Cars.Car;
import BuilderPattern.Cars.Manual;
import BuilderPattern.Director.Director;

public class BuilderPatternApp {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}
