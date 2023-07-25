package com.tolikhalas.monitoringappbackendonly.model.data.location.enums;

public enum Region {

    CHERKASY ("Черкаська"),
    CHERNIHIV ("Чернігівська"),
    CHERNIVTSI ("Чернівецька"),
    DNIPROPETROVSK ("Дніпропетровська"),
    DONETSK ("Донецька"),
    IVAN_FRANKIVSK ("Івано-Франківська"),
    KHARKIV ("Харківська"),
    KHERSON ("Херсонська"),
    KHMELNYTSKYI ("Хмельницька"),
    KIROVOHRAD ("Кіровоградська"),
    KYIV ("Київська"),
    LUHANSK ("Луганська"),
    LVIV ("Львівська"),
    MYKOLAIV ("Миколаївська"),
    ODESSA ("Одеська"),
    POLTAVA ("Полтавська"),
    RIVNE ("Рівненська"),
    SUMY ("Сумська"),
    TERNOPIL ("Тернопільська"),
    VINNYTSIA ("Вінницька"),
    VOLYN ("Волинська"),
    ZAKARPATTIA ("Закарпатська"),
    ZAPORIZHIA ("Запорізька"),
    ZHYTOMYR ("Житомирська");

    private final String regionNameUa;

    Region(String regionNameUa) {
        this.regionNameUa = regionNameUa;
    }

    public String getRegionNameUa() {
        return regionNameUa;
    }
}
