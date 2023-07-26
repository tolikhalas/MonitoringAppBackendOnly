package com.tolikhalas.monitoringappbackendonly.repository.data.pledge;

import com.tolikhalas.monitoringappbackendonly.model.data.PledgeObject;
import com.tolikhalas.monitoringappbackendonly.model.data.pledge.PledgeContent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PledgeContentRepository extends JpaRepository<PledgeContent, Long> {

    Optional<PledgeContent> findAllByPledgeObject(PledgeObject pledgeObject);

}
