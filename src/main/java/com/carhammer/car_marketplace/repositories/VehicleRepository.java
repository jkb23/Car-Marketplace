package com.carhammer.car_marketplace.repositories;

import com.carhammer.car_marketplace.models.vehicle.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
