package com.tolikhalas.monitoringappbackendonly.model.auth;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(schema = "users", name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long roleId;

    @Column(unique = true)
    private String authority;

    @Override
    public String getAuthority() {
        return this.authority;
    }

    public Role(String authority) {
        this.authority = authority;
    }
}
