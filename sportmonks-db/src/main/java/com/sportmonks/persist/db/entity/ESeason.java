package com.sportmonks.persist.db.entity;

import com.sportmonks.client.core.data.entity.Season;

import javax.persistence.*;

@Entity
@Table(name = "season")
public class ESeason {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "LEAGUE_ID", referencedColumnName = "ID")
    private ELeague league;

    public ESeason() {
    }

    public ESeason(Season season, ELeague eLeague) {
        this.id = season.getId();
        this.name = season.getName();
        this.league = eLeague;
    }
}
