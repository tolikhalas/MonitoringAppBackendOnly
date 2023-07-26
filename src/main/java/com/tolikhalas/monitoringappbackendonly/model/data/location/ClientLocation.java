package com.tolikhalas.monitoringappbackendonly.model.data.location;

import com.tolikhalas.monitoringappbackendonly.model.data.client.Client;
import com.tolikhalas.monitoringappbackendonly.model.data.location.enums.Country;
import com.tolikhalas.monitoringappbackendonly.model.data.location.enums.Region;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(schema = "data", name = "client_locations")
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class ClientLocation extends Location {

    @Id
    @Column(name = "client_id")
    private Long clientId;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<Client> clients;

}
