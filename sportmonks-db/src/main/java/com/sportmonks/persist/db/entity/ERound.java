package com.sportmonks.persist.db.entity;

import com.sportmonks.client.core.data.entity.Round;

import javax.persistence.*;

@Entity
@Table(name = "round")
public class ERound {

    @Id
    private Long id;

    @Column(nullable = false)
    private Integer name;

    @Column(nullable = false)
    private String start;

    @Column(nullable = false)
    private String end;

    @OneToOne
    @JoinColumn(name = "LEAGUE_ID", referencedColumnName = "ID")
    private ELeague league;

    @OneToOne
    @JoinColumn(name = "SEASON_ID", referencedColumnName = "ID")
    private ESeason season;

    @OneToOne
    @JoinColumn(name = "STAGE_ID", referencedColumnName = "ID")
    private EStage stage;

    public ERound() {
    }

    public ERound(Round round, ELeague league, ESeason season, EStage stage) {
        this.id = round.getId();
        this.name = round.getName();
        this.start = round.getStart();
        this.end = round.getEnd();
        this.league = league;
        this.season = season;
        this.stage = stage;
    }
}
