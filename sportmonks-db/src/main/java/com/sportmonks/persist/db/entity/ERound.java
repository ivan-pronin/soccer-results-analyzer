package com.sportmonks.persist.db.entity;

import javax.persistence.*;

//@Entity
//@Table(name = "round")
public class ERound {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "SPORTMONKS_ID")
    private Long sportmonksId;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "LEAGUE_SPORTMONKS_ID", referencedColumnName = "SPORTMONKS_ID")
    private ELeague league;

    @OneToOne
    @JoinColumn(name = "SEASON_SPORTMONKS_ID", referencedColumnName = "SPORTMONKS_ID")
    private ESeason season;

    public ERound(Long sportmonksId, String name, ELeague league) {
        this.sportmonksId = sportmonksId;
        this.name = name;
        this.league = league;
    }
}
