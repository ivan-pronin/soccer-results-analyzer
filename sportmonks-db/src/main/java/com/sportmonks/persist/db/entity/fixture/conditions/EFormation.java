package com.sportmonks.persist.db.entity.fixture.conditions;

import javax.persistence.*;

@Entity
@Table(name = "formation")
public class EFormation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;

    public EFormation() {
    }

    public EFormation(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
