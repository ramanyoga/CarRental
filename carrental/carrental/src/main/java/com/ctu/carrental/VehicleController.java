/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ctu.carrental;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author User
 */
@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleService service;

    public VehicleController(VehicleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Vehicle> getAll() {
        return service.findAll();
    }

    @GetMapping("/search")
    public List<Vehicle> search(@RequestParam String make) {
        return service.searchByMake(make);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vehicle> getOne(@PathVariable int id) {
        Vehicle v = service.findById(id);

        if (v == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(v);
    }
}
