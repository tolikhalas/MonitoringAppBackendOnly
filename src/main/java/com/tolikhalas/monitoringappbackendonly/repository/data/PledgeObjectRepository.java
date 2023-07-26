package com.tolikhalas.monitoringappbackendonly.repository.data;

import com.tolikhalas.monitoringappbackendonly.model.data.PledgeObject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PledgeObjectRepository extends JpaRepository<PledgeObject, Long> {

}
