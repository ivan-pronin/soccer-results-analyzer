package com.sportmonks.persist.db.entity;

import com.sportmonks.client.core.data.entity.Country;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "country")
public class ECountry implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, unique = true, name = "SPORTMONKS_ID")
    private Long sportmonksId;

    @Column(nullable = false)
    private String name;

    public ECountry() {
    }

    public ECountry(Country country) {
        this.sportmonksId = country.getId();
        this.name = country.getName();
    }

    public ECountry(Long sportmonksId, String name) {
        this.sportmonksId = sportmonksId;
        this.name = name;
    }

    public Long getSportmonksId() {
        return sportmonksId;
    }
}
