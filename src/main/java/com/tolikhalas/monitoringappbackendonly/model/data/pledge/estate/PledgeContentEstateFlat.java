package com.tolikhalas.monitoringappbackendonly.model.data.pledge.estate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(schema = "data", name = "pledge_content_estate_flats")
@Data
@EqualsAndHashCode(callSuper = false)
public class PledgeContentEstateFlat extends PledgeContentEstate {

}
