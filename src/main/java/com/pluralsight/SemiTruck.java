package com.pluralsight;


public class SemiTruck extends Vehicle {

    private int trailerCapacity;

    public SemiTruck(String color, int numberOfPassengers,
                     int cargoCapacity, int fuelCapacity,
                     int trailerCapacity) {

        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        this.trailerCapacity = trailerCapacity;
    }

    public int getTrailerCapacity() {
        return trailerCapacity;
    }

    public void setTrailerCapacity(int trailerCapacity) {
        this.trailerCapacity = trailerCapacity;
    }
}

