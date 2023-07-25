package com.tolikhalas.monitoringappbackendonly.model.data.location;

import com.tolikhalas.monitoringappbackendonly.model.data.location.enums.Country;
import com.tolikhalas.monitoringappbackendonly.model.data.location.enums.Region;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class PledgeLocation extends Location {

    private String street;

    private Integer buildingNumber;

    private String buildingNumberLetter;

    private Integer flatNumber;

    private String postalCode;

    public PledgeLocation(Country country,
                          Region region,
                          String populatedArea,
                          String street,
                          Integer buildingNumber) {
        this.country = country;
        this.region = region;
        this.populatedArea = populatedArea;
        this.street = street;
        this.buildingNumber = buildingNumber;
    }

    public PledgeLocation(Country country,
                          Region region,
                          String populatedArea,
                          String street,
                          Integer buildingNumber,
                          String buildingNumberLetter) {
        this.country = country;
        this.region = region;
        this.populatedArea = populatedArea;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.buildingNumberLetter = buildingNumberLetter;
    }

    public PledgeLocation(Country country,
                          Region region,
                          String populatedArea,
                          String street,
                          Integer buildingNumber,
                          String buildingNumberLetter,
                          Integer flatNumber) {
        this.country = country;
        this.region = region;
        this.populatedArea = populatedArea;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.buildingNumberLetter = buildingNumberLetter;
        this.flatNumber = flatNumber;
    }
}
