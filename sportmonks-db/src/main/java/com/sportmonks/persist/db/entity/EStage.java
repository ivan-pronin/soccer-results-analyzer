package com.sportmonks.persist.db.entity;

import com.sportmonks.client.core.data.entity.Stage;

import javax.persistence.*;

@Entity
@Table(name = "stage")
public class EStage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "SPORTMONKS_ID")
    private Long sportmonksId;

    @Column(nullable = false)
    private String name;

    @Column
    private String type;

//    @OneToOne
//    @JoinColumn(name = "LEAGUE_SPORTMONKS_ID", referencedColumnName = "SPORTMONKS_ID")
//    private ELeague league;
//
//    @OneToOne
//    @JoinColumn(name = "SEASON_SPORTMONKS_ID", referencedColumnName = "SPORTMONKS_ID")
//    private ESeason season;
//
//    public EStage(Stage stage, ELeague league, ESeason season) {
//        this.sportmonksId = stage.getId();
//        this.name = stage.getName();
//        this.league = league;
//        this.season = season;
//    }
}
