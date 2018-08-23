package com.sportmonks.persist.db.entity;

import com.sportmonks.client.core.data.entity.League;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "league")
public class ELeague implements Serializable {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "COUNTRY_ID", referencedColumnName = "ID")
    private ECountry country;

    public ELeague() {
    }

    public ELeague(League league, ECountry country) {
        this.id = league.getId();
        this.name = league.getName();
        this.country = country;
    }
}
