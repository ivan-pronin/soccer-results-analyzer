package com.sportmonks.persist.db.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "league")
public class ELeague implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "SPORTMONKS_ID")
    private Long sportmonksId;

    @OneToOne
    @JoinColumn(name = "COUNTRY_SPORTMONKS_ID", referencedColumnName = "SPORTMONKS_ID")
    private ECountry country;

    public ELeague() {
    }

    public ELeague(ECountry country, long sportmonksId, String name) {
        this.country = country;
        this.sportmonksId = sportmonksId;
        this.name = name;
    }

    public Long getSportmonksId() {
        return sportmonksId;
    }
}
