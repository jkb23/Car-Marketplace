package com.carhammer.car_marketplace;

import com.carhammer.car_marketplace.models.vehicle.Manufacturer;
import com.carhammer.car_marketplace.models.vehicle.Model;
import com.carhammer.car_marketplace.repositories.ManufacturerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataInitializationRunner implements CommandLineRunner {

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    @Override
    public void run(String... args) {
        if (manufacturerRepository.count() == 0) {
            initializeData();
        }
    }

    private void initializeData() {
        Manufacturer mercedes = Manufacturer.builder()
                .countryOfOrigin("Germany")
                .name("Mercedes")
                .build();

        Manufacturer toyota = Manufacturer.builder()
                .countryOfOrigin("Japan").name("Toyota")
                .build();

        Manufacturer ford = Manufacturer.builder()
                .countryOfOrigin("USA")
                .name("Ford")
                .build();

        Model eClass = Model.builder()
                .manufacturer(mercedes)
                .name("E class")
                .build();

        Model cClass = Model.builder()
                .manufacturer(mercedes)
                .name("C class")
                .build();

        Model corolla = Model.builder()
                .manufacturer(toyota)
                .name("Corolla")
                .build();

        Model camry = Model.builder()
                .manufacturer(toyota)
                .name("Camry")
                .build();

        Model mustang = Model.builder()
                .manufacturer(ford)
                .name("Mustang")
                .build();

        Model fiesta = Model.builder()
                .manufacturer(ford)
                .name("Fiesta")
                .build();

        mercedes.setModels(Arrays.asList(eClass, cClass));
        toyota.setModels(Arrays.asList(corolla, camry));
        ford.setModels(Arrays.asList(mustang, fiesta));

        manufacturerRepository.save(mercedes);
        manufacturerRepository.save(toyota);
        manufacturerRepository.save(ford);
    }
}
