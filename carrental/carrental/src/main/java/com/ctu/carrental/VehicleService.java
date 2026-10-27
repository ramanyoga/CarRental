/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ctu.carrental;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {
    private final List<Vehicle> vehicles = new ArrayList<>();
    private int nextId = 4;

    public VehicleService() {
        vehicles.add(new Vehicle(1, "Toyota", "Corolla", 450.00, true));
        vehicles.add(new Vehicle(2, "VW", "Polo", 380.00, true));
        vehicles.add(new Vehicle(3, "Ford", "Ranger", 750.00, false));
    }

    public List<Vehicle> findAll() {
        return vehicles;
    }

    List<Vehicle> searchByMake(String make) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Vehicle findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}