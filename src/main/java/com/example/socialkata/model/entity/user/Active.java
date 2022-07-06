package com.example.socialkata.model.entity.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "active")
public class Active {

    @Id
    @GeneratedValue(generator = "active_seq")
    private Long id;

    @Column
    private String name;

    @Transient
    @OneToMany(mappedBy = "active")
    private Set<User> users;

    public Active(String name) {
        this.name = name;
    }
}
