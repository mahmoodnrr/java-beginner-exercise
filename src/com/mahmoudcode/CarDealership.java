package com.mahmoudcode;

import com.mahmoudcode.exercise.Car;

import java.util.Arrays;

public class CarDealership {

    private String dealershipName;
    private int maxCarLimit;
    private Car[] carsInShop;

    public CarDealership(){};

    public CarDealership(String dealershipName, int maxCarLimit) {
        this.dealershipName = dealershipName;
        this.maxCarLimit = maxCarLimit;
        this.carsInShop = new Car[this.maxCarLimit];
    }

    public String getDealershipName() {
        return dealershipName;
    }

    public int getMaxCarLimit() {
        return maxCarLimit;
    }

    public Car[] getCarsInShop() {
        return this.carsInShop;
    }

    public void addCarstoStock(Car car){

        int currentCarStock = getCarCount();

        if(currentCarStock < getMaxCarLimit()){
            carsInShop[currentCarStock] = car;
            System.out.println(car.getManufacturerName() + " " + car.getEngineType() + " has been added to stock.");
        }
        else{
            System.out.println("Maximum store capacity has been reached");
        }
    }

    private int getCarCount(){
        int count = 0;
        for(Car car : carsInShop){
            if(car != null) {
                count ++;
            }
        }
        return count;
    }

    public Car findCarByManufacturer(String manufacturer){

        if(manufacturer == null || manufacturer.isEmpty()){
            System.out.println("Please type a valid manufacturer name");
        }

        if(getCarCount() == 0){
            System.out.println("Car stock is empty");
        }

        for(Car car : carsInShop){
            if(car.getManufacturerName().equalsIgnoreCase(manufacturer)){
                System.out.println("We found a matching car in stock");
                return car;
            }
        }

        System.out.println("No matching car in stock");
        return null;
    }

    @Override
    public String toString() {
        return "CarDealership{" +
                "dealershipName='" + dealershipName + '\'' +
                ", maxCarLimit=" + maxCarLimit +
                ", carsInShop=" + Arrays.toString(carsInShop) +
                '}';
    }
}
