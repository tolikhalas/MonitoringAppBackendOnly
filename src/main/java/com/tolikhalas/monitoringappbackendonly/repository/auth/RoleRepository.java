package com.tolikhalas.monitoringappbackendonly.repository.auth;

import com.tolikhalas.monitoringappbackendonly.model.auth.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByAuthority(String authority);

}
