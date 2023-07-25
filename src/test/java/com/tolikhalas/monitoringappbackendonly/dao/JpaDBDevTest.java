package com.tolikhalas.monitoringappbackendonly.dao;

import com.tolikhalas.monitoringappbackendonly.model.auth.Auditor;
import com.tolikhalas.monitoringappbackendonly.model.auth.Role;
import com.tolikhalas.monitoringappbackendonly.model.data.PledgeObject;
import com.tolikhalas.monitoringappbackendonly.repository.auth.AuditorRepository;
import com.tolikhalas.monitoringappbackendonly.repository.data.PledgeObjectRepository;
import com.tolikhalas.monitoringappbackendonly.repository.auth.RoleRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.Set;


@RunWith(SpringRunner.class)
@ActiveProfiles({"dev"})
@SpringBootTest
@EnableTransactionManagement
public class JpaDBDevTest {

    @Autowired
    private AuditorRepository auditorRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PledgeObjectRepository pledgeObjectRepository;

    @Test
    @Disabled
    @Transactional("auditorTransactionManager")
    public void createAuditorAndAssertNotNullByUsername() {
        Auditor auditor = new Auditor();
        auditor.setUsername("auditor");
        auditor.setEmail("johndoe@mail.com");

        Role auditorRole = new Role();
        auditorRole.setAuthority("AUDITOR");
        roleRepository.save(auditorRole);

        Set<Role> roles = new HashSet<>();
        roles.add(auditorRole);

        auditor.setAuthorities(roles);

        auditorRepository.save(auditor);
        Assert.assertNotNull(auditorRepository.findByUsername("auditor").get());
    }

    @Test
    @Disabled
    @Transactional("dataTransactionManager")
    public void createDataAndAssertNotNullByValue() {
//        PledgeObject pledgeObject = new PledgeObject();
//        pledgeObject.setValue("mock");
//
//        pledgeObjectRepository.save(pledgeObject);
//
//        Assert.assertNotNull(pledgeObjectRepository.findByValue("mock").get());
    }
}
