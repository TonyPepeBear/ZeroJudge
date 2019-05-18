package com.tonypepe.zerojudge.d.d700;

import java.util.ArrayList;
import java.util.Scanner;

public class D710 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            int n = scanner.nextInt(), m = scanner.nextInt();
            ParkingLot parkingLot = new ParkingLot(n, scanner);
            parkingLot.query(m, scanner);
        }
    }

    static class ParkingLot {
        private ArrayList<Car> cars = new ArrayList<>();

        ParkingLot(int n, Scanner scanner) {
            for (int i = 0; i < n; i++) {
                cars.add(new Car(scanner.next(), scanner.next()));
            }
        }

        void query(int m, Scanner scanner) {
            for (int i = 0; i < m; i++) {
                switch (scanner.next()) {
                    case "brand":
                        String brand = scanner.next();
                        for (Car car : cars) {
                            if (car.getType().equals(brand)) {
                                System.out.println(car.toString());
                            }
                        }
                        break;
                    case "color":
                        String color = scanner.next();
                        for (Car car : cars) {
                            if (car.getColor().equals(color)) {
                                System.out.println(car.toString());
                            }
                        }
                        break;
                }
            }
        }
    }

    static class Car {
        private String type;
        private String color;

        Car(String type, String color) {
            this.type = type;
            this.color = color;
        }

        String getType() {
            return type;
        }

        String getColor() {
            return color;
        }

        @Override
        public String toString() {
            return type + " " + color;
        }
    }
}


