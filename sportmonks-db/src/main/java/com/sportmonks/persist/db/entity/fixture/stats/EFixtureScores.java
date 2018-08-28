package com.sportmonks.persist.db.entity.fixture.stats;

import com.sportmonks.client.core.data.entity.FixtureScores;
import com.sportmonks.persist.db.entity.fixture.EFixture;

import javax.persistence.*;

@Entity
@Table(name = "fixture_scores")
public class EFixtureScores {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Integer localTeamScore;
    @Column
    private Integer visitorTeamScore;
    @Column
    private Integer localTeamPenScore;
    @Column
    private Integer visitorTeamPenScore;
    @Column
    private String htScore;
    @Column
    private String ftScore;
    @Column
    private String etScore;

    @OneToOne
    @JoinColumn(name = "FIXTURE_ID", nullable = false)
    private EFixture fixture;

    public EFixtureScores() {
    }

    public EFixtureScores(EFixture fixture, FixtureScores fixtureScores) {
        this.fixture = fixture;
        this.localTeamScore = fixtureScores.getLocalTeamScore();
        this.visitorTeamScore = fixtureScores.getVisitorTeamScore();
        this.localTeamPenScore = fixtureScores.getLocalTeamPenScore();
        this.visitorTeamPenScore = fixtureScores.getVisitorTeamPenScore();
        this.htScore = fixtureScores.getHtScore();
        this.ftScore = fixtureScores.getFtScore();
        this.etScore = fixtureScores.getEtScore();
    }
}
