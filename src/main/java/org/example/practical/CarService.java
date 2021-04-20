package org.example.practical;

/**
 * Given a class Car, and a array of cars please implement a method that will return data
 * structure allowing getting all cars by any color. Cars array is data source
 */
public class CarService {

    public static void main(String[] args) {
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
        private final String make;
        private final String model;
        private final String color;

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
}
