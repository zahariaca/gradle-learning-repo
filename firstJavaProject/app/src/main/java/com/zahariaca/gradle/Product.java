package com.zahariaca.gradle;

public class Product {
    public String name;
    public String description;
    public float price;

    @Override
    public String toString() {
        return "Product name: " + this.name
                + " description: " + this.description
                + " price: " + this.price;
    }

}
