package com.tolikhalas.monitoringappbackendonly.model.data;

import com.tolikhalas.monitoringappbackendonly.model.data.client.Client;
import com.tolikhalas.monitoringappbackendonly.model.data.deal.Deal;
import com.tolikhalas.monitoringappbackendonly.model.data.pledge.PledgeContent;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(schema = "data", name = "pledge_objects")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PledgeObject {

    @Id
    @Column(name = "pledge_object_id")
    private Long pledgeObjectId;

    @ManyToOne
    private Client pledger;

    @ManyToOne
    private Client borrower;

    @ManyToOne
    private Deal credit;

    @ManyToOne
    private Deal pledge;

    @OneToMany(mappedBy = "pledgeObject", fetch = FetchType.EAGER)
    private Set<PledgeContent> contents;

}
