package com.tolikhalas.monitoringappbackendonly.model.data.pledge.type;

public enum PledgeType {

    LIVING_ESTATE_FLAT("25001", "Житлова нерухомість (квартири)"),
    LIGHT_VEHICLE("35001", "Легкі транспортні засоби"),
    NON_LIVING_ESTATE_1("37001", "Нерухоме майно, що належить до житлового фонду (крім земельних ділянок)"),
    NON_LIVING_ESTATE_2("37004", "Нерухоме майно, що належить до житлового фонду (крмі земельних ділянок)"),
    HEAVY_OR_SPECIAL_VEHICLE("38001", "Транспортні засоби (вантажні, автобуси, спецтехніка)"),
    AGRICULTURAL_VEHICLE("38002", "Сільськогосподарська техніка - трактори, комбайни, навісне обладнання (борони, плуги, оприскувачі)"),
    EQUIPMENT("51001", "Устаткування, обладнання"),
    NON_LIVING_FUNCTIONAL_ESTATE("68001", "Земельні ділянки, оформленні на правах власності, на яких розташоване нерухоме майно, що не належить до житлового фонду, і площа яких безпосередньо використовується у функціонуванні об'єкта"),
    LIVING_ESTATE_HOUSE("71001", "Нерухоме майно, що належить до житлового фонду (будинки)");


    private final String pledgeTypeCode;

    private final String pledgeTypeDesc;

    PledgeType(String pledgeTypeCode, String pledgeTypeDesc) {
        this.pledgeTypeCode = pledgeTypeCode;
        this.pledgeTypeDesc = pledgeTypeDesc;
    }

    public String getPledgeTypeCode() {
        return pledgeTypeCode;
    }

    public String getPledgeTypeDesc() {
        return pledgeTypeDesc;
    }

    public static PledgeType getFromCode(String pledgeTypeCode) {
        switch (pledgeTypeCode) {
            case "25001" -> {
                return LIVING_ESTATE_FLAT;
            }
            case "35001" -> {
                return LIGHT_VEHICLE;
            }
            case "37001" -> {
                return NON_LIVING_ESTATE_1;
            }
            case "37004" -> {
                return NON_LIVING_ESTATE_2;
            }
            case "38001" -> {
                return HEAVY_OR_SPECIAL_VEHICLE;
            }
            case "38002" -> {
                return AGRICULTURAL_VEHICLE;
            }
            case "51001" -> {
                return EQUIPMENT;
            }
            case "68001" -> {
                return NON_LIVING_FUNCTIONAL_ESTATE;
            }
            case "71001" -> {
                return LIVING_ESTATE_HOUSE;
            }
            default -> {
                throw new IllegalArgumentException("No code for pledge type: " + pledgeTypeCode);
            }
        }
    }

}
