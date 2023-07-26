package com.tolikhalas.monitoringappbackendonly.repository.data.pledge.estate;

import com.tolikhalas.monitoringappbackendonly.model.data.pledge.estate.PledgeContentEstate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PledgeContentEstateRepository extends JpaRepository<PledgeContentEstate, Long> {
}
