package com.tolikhalas.monitoringappbackendonly.model.data.deal;

import com.tolikhalas.monitoringappbackendonly.model.data.PledgeObject;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(schema = "data", name = "deals")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Deal {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deal_id")
    private Long dealId;

    private String dealNumber;

    private LocalDate dealDate;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<PledgeObject> pledgeObject;

}
