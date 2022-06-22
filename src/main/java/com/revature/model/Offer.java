package com.revature.model;

import java.util.Objects;

public class Offer {
    private int id;
    private String open;
    private String approved;
    private String rejected;

    public Offer() {
    }

    public Offer(String open, String approved, String rejected) {
        this.open = open;
        this.approved = approved;
        this.rejected = rejected;
    }

    public int getId() {
        return id;
    }

    public Offer setId(int id) {
        this.id = id;
        return this;
    }

    public String getOpen() {
        return open;
    }

    public Offer setOpen(String open) {
        this.open = open;
        return this;
    }

    public String getApproved() {
        return approved;
    }

    public Offer setApproved(String approved) {
        this.approved = approved;
        return this;
    }

    public String getRejected() {
        return rejected;
    }

    public Offer setRejected(String rejected) {
        this.rejected = rejected;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Offer offer = (Offer) o;
        return id == offer.id && open.equals(offer.open) && approved.equals(offer.approved) && rejected.equals(offer.rejected);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, open, approved, rejected);
    }

    @Override
    public String toString() {
        return "Offer{" +
                "id=" + id +
                ", open='" + open + '\'' +
                ", approved='" + approved + '\'' +
                ", rejected='" + rejected + '\'' +
                '}';
    }
}
