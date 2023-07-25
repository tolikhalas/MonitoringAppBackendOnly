package com.tolikhalas.monitoringappbackendonly.model.data.location.enums;

public enum Country {
    UKRAINE("ua", "Україна", "Ukraine");

    private final String countryCode;

    private final String countryNameUa;

    private final String countryNameEn;

    Country(String countryCode, String countryNameUa, String countryNameEn) {
        this.countryCode = countryCode;
        this.countryNameUa = countryNameUa;
        this.countryNameEn = countryNameEn;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryNameUa() {
        return countryNameUa;
    }

    public String getCountryNameEn() {
        return countryNameEn;
    }

    public static Country getFromCode(String countryCode) {
        switch (countryCode) {
            case "ua" -> {
                return UKRAINE;
            }
            default -> {
                throw new IllegalArgumentException("No code for country: " + countryCode);
            }
        }
    }
}
