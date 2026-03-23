package com.mahmoudcode.exercise;

import com.mahmoudcode.exercise.enums.EngineType;

public class Car {

    private String manufacturerName;
    private double price;
    private EngineType engineType;

    public Car(){}

    public Car(String manufacturer, double price, EngineType engineType) {
        this.manufacturerName = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }


    @Override
    public String toString() {
        return "Car{" +
                "manufacturerName='" + manufacturerName + '\'' +
                ", price=" + price +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
