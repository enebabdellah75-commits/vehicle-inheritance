package com.pluralsight;

public class Program {

    public static void main(String[] args) {

        Moped slowRide = new Moped("Red", 1, 0, 5);

        Car familyCar = new Car("Blue", 5, 0, 50, 4);

        SemiTruck bigTruck =
                new SemiTruck("Black", 2, 10000, 200, 50000);

        Hovercraft waterRide =
                new Hovercraft("White", 6, 500, 100, true);

        System.out.println("Moped: " + slowRide.getColor());

        System.out.println("Car: " + familyCar.getColor());

        System.out.println("SemiTruck: " + bigTruck.getColor());

        System.out.println("Hovercraft: " + waterRide.getColor());
    }
}
