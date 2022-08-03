package com.company.hometask.decomposition;

public class Car {
    private String color;
    private long carId;
    private Motor motor;
    private Tire[] tires;
    private Turbine turbine;

    public Car(String color, long carId, Motor motor, Tire[] tires, Turbine turbine) {
        this.color = color;
        this.carId = carId;
        this.motor = motor;
        this.tires = tires;
        this.turbine = turbine;
    }


}
