package com.sportmonks.persist.db.entity;

import com.sportmonks.client.core.data.entity.Stage;

import javax.persistence.*;

@Entity
@Table(name = "stage")
public class EStage {

    @Id
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "LEAGUE_ID", referencedColumnName = "ID")
    private ELeague league;

    @OneToOne
    @JoinColumn(name = "SEASON_ID", referencedColumnName = "ID")
    private ESeason season;

    public EStage() {
    }

    public EStage(Stage stage, ELeague league, ESeason season) {
        this.id = stage.getId();
        this.name = stage.getName();
        this.league = league;
        this.season = season;
    }

    public ELeague getLeague() {
        return league;
    }

    public ESeason getSeason() {
        return season;
    }
}
