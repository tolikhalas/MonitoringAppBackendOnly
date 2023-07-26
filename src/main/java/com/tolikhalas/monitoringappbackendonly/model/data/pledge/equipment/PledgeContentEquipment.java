package com.tolikhalas.monitoringappbackendonly.model.data.pledge.equipment;

import com.tolikhalas.monitoringappbackendonly.model.data.pledge.PledgeContent;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class PledgeContentEquipment extends PledgeContent {

    private String equipmentName;

    private String brand;

    private String model;

    private Integer yearOfManufacture;

    private Integer yearOfStartingUsage;

    private String serialNumber;

    private String inventoryNumber;

}
