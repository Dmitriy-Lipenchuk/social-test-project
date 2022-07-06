package com.example.socialkata.model.entity.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "role")
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(generator = "role_seq")
    private Long id;

    @Column
    private String name;


    @Override
    public String getAuthority() {
        return name;
    }
}
