package com.directi.training.srp.exercise_refractored;

import java.util.List;

public class CarFormatter
{

    private List<Car> _carsDb;
    

    public CarFormatter(CarRepository carRepository)
    {
       _carsDb = carRepository.getAllCars();
    }

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

}
