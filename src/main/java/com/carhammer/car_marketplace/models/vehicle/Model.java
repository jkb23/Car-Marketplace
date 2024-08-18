package com.carhammer.car_marketplace.models.vehicle;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Model {
    @ManyToOne
    @JoinColumn(name = "manufacturer_id")

    @NonNull
    private  Manufacturer manufacturer;

    @NonNull
    private  String name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
