package com.tolikhalas.monitoringappbackendonly.model.data.client;

import com.tolikhalas.monitoringappbackendonly.model.data.client.scrooge.CompanyType;
import com.tolikhalas.monitoringappbackendonly.model.data.location.ClientLocation;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "client")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(schema = "data", name = "clients")
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long client_id;

    protected String companyName;

    protected CompanyType companyType;

    protected Person agent;

    @ManyToOne
    protected ClientLocation location;

    public Client(String companyName, CompanyType companyType, Person agent) {
        this.companyName = companyName;
        this.companyType = companyType;
        this.agent = agent;
    }
}
