package com.directi.training.srp.Exercice_Corrige;

import java.util.Arrays;
import java.util.List;

import com.directi.training.srp.exercise.Car;

public class CarDatabase {
    private List<Car> _carsDb = Arrays.asList(
            new Car("1", "Golf III", "Volkswagen"),
            new Car("2", "Multipla", "Fiat"),
            new Car("3", "Megane", "Renault")
    );

    public Car getCarById(final String carId) {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
}
