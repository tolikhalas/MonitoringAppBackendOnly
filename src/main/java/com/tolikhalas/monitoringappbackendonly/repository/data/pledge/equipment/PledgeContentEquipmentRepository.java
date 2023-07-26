package com.tolikhalas.monitoringappbackendonly.repository.data.pledge.equipment;

import com.tolikhalas.monitoringappbackendonly.model.data.pledge.equipment.PledgeContentEquipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PledgeContentEquipmentRepository extends JpaRepository<PledgeContentEquipment, Long> {

}
