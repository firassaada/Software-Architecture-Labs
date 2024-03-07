package com.directi.training.srp.Exercice_Corrige;

import java.util.List;

import com.directi.training.srp.exercise.Car;

public class CarFormatter {
    public static String formatCarNames(List<Car> cars) {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
