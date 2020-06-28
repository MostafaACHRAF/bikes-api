package com.bikesglobalstore.bikes.repositories;

import com.bikesglobalstore.bikes.entities.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
