package com.sportmonks.persist.db.entity.fixture.conditions;

import com.sportmonks.client.core.data.entity.FixtureStandings;
import com.sportmonks.persist.db.entity.fixture.EFixture;

import javax.persistence.*;

@Entity
@Table(name = "fixture_standings")
public class EFixtureStandings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Integer localTeamPosition;
    @Column
    private Integer visitorTeamPosition;

    @OneToOne
    @JoinColumn(name = "FIXTURE_ID", nullable = false)
    private EFixture fixture;

    public EFixtureStandings() {
    }

    public EFixtureStandings(EFixture fixture, FixtureStandings fixtureStandings) {
        this.fixture = fixture;
        this.localTeamPosition = fixtureStandings.getLocalTeamPosition();
        this.visitorTeamPosition = fixtureStandings.getVisitorTeamPosition();
    }
}
