package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a class Car, and a array of cars please implement a method that will return data
 * structure allowing to getting all cars by any color.
 */
public class CarService {

    public static void main(String[] args) {
        HashMap<String, List<String>> byColor = getByColor(cars);
        for (Map.Entry<String, List<String>> stringListEntry : byColor.entrySet()) {
            System.out.println(stringListEntry);
        }
    }

    private static Car[] cars = {
                    new Car("AUDI","A1","black"),
                    new Car("AUDI","Q2","red"),
                    new Car("AUDI","A3","black"),
                    new Car("AUDI","A4","silver"),
                    new Car("AUDI","A5","white"),
                    new Car("BMW","1","white"),
                    new Car("BMW","2","green"),
                    new Car("BMW","3","black"),
                    new Car("FIAT","500","red"),
    };

    static class Car {
        private String make;
        private String model;
        private String color;

        public Car(String make, String model, String color) {
            this.make = make;
            this.model = model;
            this.color = color;
        }
        public String getMake() {
            return make;
        }
        public String getModel() {
            return model;
        }
        public String getColor() {
            return color;
        }
    }

    private static HashMap<String, List<String>> getByColor(Car[] cars) {

        HashMap<String, List<String>> designationsMap = new HashMap<String, List<String>>();
        List<String> carBycolor;

        for (Car car : cars) {
            if (!designationsMap.containsKey(car.getColor())) {
                carBycolor = new ArrayList<>();
                for (Car car2 : cars) {
                    if (car2.getColor().equals(car.getColor())) {
                        carBycolor.add(car2.getMake() + "-" + car2.getModel());
                    }
                }
                designationsMap.put(car.getColor(), carBycolor);
            }

        }
        return designationsMap;
    }
}
