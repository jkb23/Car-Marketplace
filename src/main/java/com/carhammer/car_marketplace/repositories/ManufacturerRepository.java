package com.carhammer.car_marketplace.repositories;

import com.carhammer.car_marketplace.models.vehicle.Manufacturer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManufacturerRepository extends JpaRepository<Manufacturer, Long> {
}
