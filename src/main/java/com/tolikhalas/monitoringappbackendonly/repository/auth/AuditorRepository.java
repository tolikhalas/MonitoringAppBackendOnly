package com.tolikhalas.monitoringappbackendonly.repository.auth;

import com.tolikhalas.monitoringappbackendonly.model.auth.Auditor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuditorRepository extends JpaRepository<Auditor, Long> {

    Optional<Auditor> findByUsername(String username);


}
