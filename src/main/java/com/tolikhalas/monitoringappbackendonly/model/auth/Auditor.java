package com.tolikhalas.monitoringappbackendonly.model.auth;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

@Entity
@Table(schema = "users", name = "auditors")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Auditor implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auditor_id")
    private Long auditorId;


//    Auth credentials
    @Column(unique = true)
    private String username;

    private String password;

    @Column(unique = true)
    private String email;

    @ManyToMany
    @JoinTable(
            name = "auditor_role_junction",
            joinColumns = {
                    @JoinColumn(name = "auditor_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "role_id")
            }
    )
    private Set<Role> authorities;

    public Auditor(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Auditor(Long auditorId, String username, String password) {
        this.auditorId = auditorId;
        this.username = username;
        this.password = password;
    }

    public Auditor(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Auditor(Long auditorId, String username, String password, String email) {
        this.auditorId = auditorId;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
