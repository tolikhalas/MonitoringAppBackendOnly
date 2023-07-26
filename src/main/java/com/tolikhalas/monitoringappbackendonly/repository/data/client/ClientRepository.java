package com.tolikhalas.monitoringappbackendonly.repository.data.client;

import com.tolikhalas.monitoringappbackendonly.model.data.client.Client;
import com.tolikhalas.monitoringappbackendonly.model.data.client.scrooge.CompanyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.Set;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> findByCompanyName(String companyName);

    Set<Client> findAllByCompanyType(CompanyType companyType);

}
