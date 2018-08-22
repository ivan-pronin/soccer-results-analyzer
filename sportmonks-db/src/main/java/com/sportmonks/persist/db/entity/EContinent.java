package com.sportmonks.persist.db.entity;

import com.sportmonks.client.core.data.entity.Continent;

import javax.persistence.*;

@Entity
@Table(name = "continent")
public class EContinent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true)
    private Long sportmonksId;

    @Column(nullable = false)
    private String name;

    public EContinent() {
    }

    public EContinent(Continent continent) {
        this.sportmonksId = continent.getId();
        this.name = continent.getName();
    }

    public EContinent(Long sportmonksId, String name) {
        this.sportmonksId = sportmonksId;
        this.name = name;
    }
}
