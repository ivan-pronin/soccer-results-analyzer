package com.sportmonks.persist.db.entity;

import com.sportmonks.client.core.data.entity.Continent;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "continent")
public class EContinent {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    public EContinent() {
    }

    public EContinent(Continent continent) {
        this.id = continent.getId();
        this.name = continent.getName();
    }
}
