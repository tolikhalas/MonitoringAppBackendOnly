package com.tolikhalas.monitoringappbackendonly.model.data.pledge.estate;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class PledgeContentEstateFlat extends PledgeContentEstate {

}
