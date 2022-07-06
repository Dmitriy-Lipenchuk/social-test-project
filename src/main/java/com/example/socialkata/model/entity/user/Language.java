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
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(generator = "language_seq")
    private Long id;

    @Column
    private String name;

    @Transient
    @ManyToMany(mappedBy = "languages")
    private Set<User> users;
}
