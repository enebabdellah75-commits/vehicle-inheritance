package com.pluralsight;

public class Program {

    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setNumberOfPassengers(5);
        familyCar.setNumberOfDoors(4);

        SemiTruck bigTruck = new SemiTruck();
        bigTruck.setColor("Black");
        bigTruck.setCargoCapacity(10000);

        Hovercraft waterRide = new Hovercraft();
        waterRide.setColor("White");
        waterRide.setFuelCapacity(50);

        System.out.println("Moped: " + slowRide.getColor());
        System.out.println("Car: " + familyCar.getColor());
        System.out.println("SemiTruck: " + bigTruck.getColor());
        System.out.println("Hovercraft: " + waterRide.getColor());
    }
}
