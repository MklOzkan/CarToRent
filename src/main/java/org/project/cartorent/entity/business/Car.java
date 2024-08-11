package org.project.cartorent.entity.business;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "car_t")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brand;
    private String model;
    private String color;
    private String plate;
    private String fuelType;
    private String transmission;
    private String bodyType;
    private String fuelConsumption;
    private String enginePower;
    private String engineCapacity;
    private String productionYear;
    private String dailyPrice;
    private String description;
    private String imageUrl;
    private Boolean active;
    private Boolean featured;
    private Boolean builtIn;
    private Boolean available;
    private Boolean deleted;
    private LocalDateTime createDate;
    private LocalDate updateDate;
    private LocalDate deleteDate;
    private Long createdBy;
    private Long updatedBy;
    private Long deletedBy;




    @PrePersist
    public void prePersist() {
        this.createDate = java.time.LocalDateTime.now();
    }


}
