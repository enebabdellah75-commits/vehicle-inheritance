package com.pluralsight;


public class Hovercraft extends Vehicle {

    private boolean canTravelOnWater;

    public Hovercraft(String color, int numberOfPassengers,
                      int cargoCapacity, int fuelCapacity,
                      boolean canTravelOnWater) {

        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);

        this.canTravelOnWater = canTravelOnWater;
    }

    public boolean getCanTravelOnWater() {
        return canTravelOnWater;
    }

    public void setCanTravelOnWater(boolean canTravelOnWater) {
        this.canTravelOnWater = canTravelOnWater;
    }
}

