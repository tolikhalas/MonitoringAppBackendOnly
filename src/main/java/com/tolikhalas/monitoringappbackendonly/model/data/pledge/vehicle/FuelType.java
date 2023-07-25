package com.tolikhalas.monitoringappbackendonly.model.data.pledge.vehicle;

public enum FuelType {

    GASOLINE("бензин"),
    GAS("газ"),
    DIESEL("дизель"),
    ELECTRIC("електричний"),
    BIOFUEL("біопаливо");

    private final String fuelTypeDescUa;

    FuelType(String fuelTypeDescUa) {
        this.fuelTypeDescUa = fuelTypeDescUa;
    }

    public String getFuelTypeDescUa() {
        return fuelTypeDescUa;
    }
}
