package com.tolikhalas.monitoringappbackendonly.model.data.client.scrooge;

public enum ScroogeType {

//    Regular scrooge
    CORPORATE("02", "Корпоративні клієнти"),
    MEDIUM_BUSINESS("03", "Клієнти середнього бізнесу"),
    SMALL_BUSINESS("04", "Клієнти малого бізнесу"),
    MICRO_BUSINESS("07", "Клієнти мікро бізнесу"),

//    SKK Scrooge

    CORPORATE_SKK("08", "Корпоративні клієнти (СКК)");

    private final String scroogeCode;

    private final String scroogeDesc;

    ScroogeType(String scroogeCode, String scroogeDesc) {
        this.scroogeCode = scroogeCode;
        this.scroogeDesc = scroogeDesc;
    }

    public String getScroogeCode() {
        return scroogeCode;
    }

    public String getScroogeDesc() {
        return scroogeDesc;
    }

    public static ScroogeType getFromCode(String code) {
        switch (code) {
            case "02" -> {
                return CORPORATE;
            }
            case "03" -> {
                return MEDIUM_BUSINESS;
            }
            case "04" -> {
                return SMALL_BUSINESS;
            }
            case "07" -> {
                return MICRO_BUSINESS;
            }
            case "08" -> {
                return CORPORATE_SKK;
            }
            default ->
                throw new IllegalArgumentException("No such code for scrooge: " + code);

        }
    }

}
