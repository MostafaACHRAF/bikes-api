package com.bikesglobalstore.bikes.controllers;

import com.bikesglobalstore.bikes.entities.Bike;
import com.bikesglobalstore.bikes.enumerations.BikeModel;
import com.bikesglobalstore.bikes.repositories.BikeRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/bikes")
@CrossOrigin(origins = "http://localhost:4200")
public class BikeController {
    private final BikeRepository bikeRepository;

    public BikeController(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @GetMapping
    public List<Bike> getAllBikes() {
        return this.bikeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Bike> findById(@PathVariable("id") long id) {
        return this.bikeRepository.findById(id);
    }

    @PostMapping
    public void createBike(@RequestBody Bike bike) {
        System.out.println("save new bike data...");
        this.bikeRepository.save(bike);
    }

    @GetMapping("/models")
    public List<BikeModel> getAvailableModels() {
        return Arrays.asList(BikeModel.values());
    }
}
