/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ctu.carrental;

/**
 *
 * @author User
 */
public class Vehicle {
    private int id;
    private String make;
    private String model;
    private double dailyRate;
    private boolean available;

    public Vehicle() {}

    public Vehicle(int id, String make, String model,
                   double dailyRate, boolean available) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.dailyRate = dailyRate;
        this.available = available;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public double getDailyRate() { return dailyRate; }
    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) {
        this.available = available;
    }
}


