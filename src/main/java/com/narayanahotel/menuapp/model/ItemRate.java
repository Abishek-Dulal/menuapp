package com.narayanahotel.menuapp.model;

import javax.persistence.Embeddable;


@Embeddable
public class ItemRate {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
