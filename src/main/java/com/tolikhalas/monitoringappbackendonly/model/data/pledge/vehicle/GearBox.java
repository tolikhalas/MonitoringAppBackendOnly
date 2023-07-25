package com.tolikhalas.monitoringappbackendonly.model.data.pledge.vehicle;

public enum GearBox {

    MANUAL("M", "Ручна"),
    AUTOMATE("A", "Автоматична");

    private final String gearBoxTypeCode;

    private final String gearBoxTypeDescUa;

    GearBox(String gearBoxTypeCode, String gearBoxTypeDescUa) {
        this.gearBoxTypeCode = gearBoxTypeCode;
        this.gearBoxTypeDescUa = gearBoxTypeDescUa;
    }

    public String getGearBoxTypeCode() {
        return gearBoxTypeCode;
    }

    public String getGearBoxTypeDescUa() {
        return gearBoxTypeDescUa;
    }

    public static GearBox getFromCode(String gearBoxTypeCode) {
        switch (gearBoxTypeCode) {
            case "M" -> {
                return MANUAL;
            }
            case "A" -> {
                return AUTOMATE;
            }
            default ->
                throw new IllegalArgumentException("No code for GearBox: " + gearBoxTypeCode);

        }
    }
}
