package com.tolikhalas.monitoringappbackendonly.repository.data.location;

import com.tolikhalas.monitoringappbackendonly.model.data.location.ClientLocation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientLocationRepository extends JpaRepository<ClientLocation, Long> {

}
