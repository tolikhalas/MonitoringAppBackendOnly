package com.tolikhalas.monitoringappbackendonly.model.data.pledge.product;

import com.tolikhalas.monitoringappbackendonly.model.data.pledge.PledgeContent;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class PledgeContentProduct extends PledgeContent {

    private String productName;

    private Integer amount;

    private String amountUnit;

    private Long totalBalanceValue;

    private Long totalBalanceValueSupplyAppliedForPledge;

}
