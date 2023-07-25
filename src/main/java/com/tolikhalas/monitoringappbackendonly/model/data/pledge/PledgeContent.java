package com.tolikhalas.monitoringappbackendonly.model.data.pledge;

import com.tolikhalas.monitoringappbackendonly.model.data.PledgeObject;
import com.tolikhalas.monitoringappbackendonly.model.data.location.PledgeLocation;
import com.tolikhalas.monitoringappbackendonly.model.data.pledge.type.PledgeType;
import jakarta.persistence.*;

@Entity(name = "pledgeContent")
@Table(schema = "data", name = "pledge_contents")
@MappedSuperclass
public abstract class PledgeContent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long pledgeId;

    protected PledgeType pledgeType;

    protected PledgeLocation pledgeLocation;

    protected String additionalNotes;

    @ManyToOne
    protected PledgeObject pledgeObject;
}
