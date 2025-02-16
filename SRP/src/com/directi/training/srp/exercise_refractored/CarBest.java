package com.directi.training.srp.exercise_refractored;

import java.util.List;

public class CarBest
{

    private final List<Car> _carsDb;

    public CarBest(CarRepository carRepository)
    {
       _carsDb = carRepository.getAllCars();
    }

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
