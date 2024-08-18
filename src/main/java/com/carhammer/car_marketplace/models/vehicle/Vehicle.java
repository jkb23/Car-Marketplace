package com.carhammer.car_marketplace.models.vehicle;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String color;

    @ManyToOne
    @JoinColumn(name = "engine_id")
    private Engine engine;

    private int firstRegistration;
    private boolean hybrid;
    private int mileage;

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    private Manufacturer manufacturer;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    private int numberOfDoors;
    private int numberOfSeats;
    private int powerInKw;

    @ManyToOne
    @JoinColumn(name = "transmission_id")
    private Transmission transmission;

    @Enumerated(EnumType.STRING)
    private VehicleType vehicleType;
}
