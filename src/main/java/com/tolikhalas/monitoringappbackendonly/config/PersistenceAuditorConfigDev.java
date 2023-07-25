package com.tolikhalas.monitoringappbackendonly.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;

@Configuration
@Profile({"dev"})
@PropertySource({ "classpath:application.yml" })
@EnableJpaRepositories(
        basePackages = "com.tolikhalas.monitoringappbackendonly.repository.auth",
        entityManagerFactoryRef = "auditorEntityManager",
        transactionManagerRef = "auditorTransactionManager"
)
public class PersistenceAuditorConfigDev {

    private final Environment env;

    public PersistenceAuditorConfigDev(Environment env) {
        this.env = env;
    }

    @Primary
    @Bean
    public LocalContainerEntityManagerFactoryBean auditorEntityManager() {
        LocalContainerEntityManagerFactoryBean em =
                new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(auditorDataSource());
        em.setPackagesToScan( "com.tolikhalas.monitoringappbackendonly.model.auth" );

        HibernateJpaVendorAdapter vendorAdapter =
                new HibernateJpaVendorAdapter();

        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.hbm2ddl.auto", env.getProperty("hibernate.hbm2ddl.auto"));
        properties.put("hibernate.dialect", env.getProperty("usersDBDialect"));
        em.setJpaPropertyMap(properties);

        return em;
    }

    @Primary
    @Bean
    @ConfigurationProperties(prefix = "spring.auditors-datasource")
    public DataSource auditorDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Primary
    @Bean
    public PlatformTransactionManager auditorsTransactionManager() {
        JpaTransactionManager transactionManager =
                new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                auditorEntityManager().getObject()
        );

        return transactionManager;
    }
}
