package com.tolikhalas.monitoringappbackendonly.model.data.client.scrooge;

import com.tolikhalas.monitoringappbackendonly.model.data.client.scrooge.ScroogeType;
import com.tolikhalas.monitoringappbackendonly.model.data.client.scrooge.ScroogeTypeLetter;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyType {

    private ScroogeType scroogeType;

    private ScroogeTypeLetter scroogeTypeLetter;

}
