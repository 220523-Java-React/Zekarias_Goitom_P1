package com.revature.model;

import java.io.Serializable;
import java.util.Objects;

public class Car implements Serializable {
    private int id;
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

    public int getId() {
        return id;
    }

    public Car setId(int id) {
        this.id = id;
        return this;
    }

    public String getMake() {
        return make;
    }

    public Car setMake(String make) {
        this.make = make;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;

        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, make, model, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color=" + color +
                '}';
    }
}

