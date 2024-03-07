package com.directi.training.srp.Exercice_Corrige ;

import java.util.List;
import com.directi.training.srp.exercise.Car;


public class CarSelector {
    public static Car getBestCar(List<Car> cars) {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
