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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

