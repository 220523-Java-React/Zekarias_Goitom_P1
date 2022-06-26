/*
package com.revature.model;
import java.io.Serializable;
import java.util.Objects;
public class Offer implements Serializable{

    private int id; // The number of the offer

    private int offerPrice; // The price that the customer is offering to purchase the car
    private Status status;  // Status of the offer

    private User buyer;

    private Car car;

        // No arg constructor
    public Offer() {

    }

    public int getId() {
        return id;
    }

    public Offer setId(int id) {
        this.id = id;
        return this;
    }

    public int getOfferPrice() {
        return offerPrice;
    }

    public Offer setOfferPrice(int offerPrice) {
        this.offerPrice = offerPrice;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Offer setStatus(Status status) {
        this.status = status;
        return this;
    }

    public User getBuyer() {
        return buyer;
    }

    public Offer setBuyer(User buyer) {
        this.buyer = buyer;
        return this;
    }
     public Car getCar() {
        return car;
    }

    public Offer setCar(Car car) {
        this.car = car;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return id == offer.id && Objects.equals(offerPrice, offer.offerPrice) && status == offer.status ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, offerPrice, status, buyer, car);
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", offerPrice=" + offerPrice +
                ", status=" + status +
                ", buyer=" + buyer +
                '}';
    }
}

*/
