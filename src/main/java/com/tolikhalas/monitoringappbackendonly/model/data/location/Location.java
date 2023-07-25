package com.tolikhalas.monitoringappbackendonly.model.data.location;

import com.tolikhalas.monitoringappbackendonly.model.data.location.enums.Country;
import com.tolikhalas.monitoringappbackendonly.model.data.location.enums.Region;

public abstract class Location {

    protected Country country;

    protected Region region;

    protected String populatedArea;

}
