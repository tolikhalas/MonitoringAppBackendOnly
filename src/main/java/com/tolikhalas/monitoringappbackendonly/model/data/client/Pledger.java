package com.tolikhalas.monitoringappbackendonly.model.data.client;

import com.tolikhalas.monitoringappbackendonly.model.data.PledgeObject;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * Class that represents "Заставодавець"
 */
@Entity(name = "pledger")
@Table(schema = "data", name = "pledgers")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Pledger extends Client {

    @OneToMany(mappedBy = "pledgers", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "pledge_object_id")
    private Set<PledgeObject> pledgeObjects;
}
