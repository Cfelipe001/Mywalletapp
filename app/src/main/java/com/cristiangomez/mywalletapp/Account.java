package com.cristiangomez.mywalletapp;

public class Account {

    private String name;
    private String type;
    private Double currentValue;

    private String imageUrl;



    public Account(String name, String type, Double currentValue, String imageUrl) {
        this.name = name;
        this.type = type;
        this.currentValue = currentValue;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

}