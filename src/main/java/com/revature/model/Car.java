package com.revature.model;

public class Car {
    private int vin;
    private String make;
    private String model;
    private String color;

    public Car() {
    }

    public Car(String make, String model, String color) {
        this.make = make;
        this.model = model;
        this.color = color;
    }

    public int getVin() {
        return vin;
    }

    public void setVin(int vin){
        this.vin = vin;
    }




}

