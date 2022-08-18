package com.Dnax.demo.entity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "department")
public class Department {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter @Setter private Integer id;

    @Column(name = "name")
    @Getter @Setter private String name;

    @OneToMany(mappedBy = "department")
    @Getter @Setter private Set<User> users;

}