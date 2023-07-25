package com.tolikhalas.monitoringappbackendonly.model.data.pledge.vehicle;

import com.tolikhalas.monitoringappbackendonly.model.data.pledge.PledgeContent;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(schema = "data", name = "pledge_content_vehicles")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class PledgeContentVehicle extends PledgeContent {

    private String brand;

    private String model;

    private String vehicleType;

    private Double engineVolume;

    private String color;

    private String registrationNumber;

    private Integer yearOfManufacture;

    private LocalDate registrationDate;

    private Integer mileage;

    private GearBox gearBox;

    private FuelType fuelType;

    private String certificateCodeAndNumber;

}
