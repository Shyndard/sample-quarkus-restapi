package com.shyndard.entity.dto;

public class PizzaCreationDto {
    
    private String name;
    private float price;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
