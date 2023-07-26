package com.tolikhalas.monitoringappbackendonly.repository.data.pledge.vehicle;

import com.tolikhalas.monitoringappbackendonly.model.data.pledge.vehicle.PledgeContentVehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PledgeContentVehicleRepository extends JpaRepository<PledgeContentVehicle, Long> {

}
