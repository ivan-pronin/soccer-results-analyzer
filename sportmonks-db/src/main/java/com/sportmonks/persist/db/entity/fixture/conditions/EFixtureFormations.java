package com.sportmonks.persist.db.entity.fixture.conditions;

import com.sportmonks.persist.db.entity.fixture.EFixture;

import javax.persistence.*;

@Entity
@Table(name = "fixture_formations")
public class EFixtureFormations {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "LOCAL_TEAM_FORMATION_ID", nullable = false)
    private EFormation localTeamFormationId;

    @OneToOne
    @JoinColumn(name = "VISITOR_TEAM_FORMATION_ID", nullable = false)
    private EFormation visitorTeamFormationId;

    @OneToOne
    @JoinColumn(name = "FIXTURE_ID", nullable = false)
    private EFixture fixture;

    public EFixtureFormations() {
    }

    public EFixtureFormations(EFixture fixture, EFormation localTeamFormation, EFormation visitorTeamFormation) {
        this.fixture = fixture;
        this.localTeamFormationId = localTeamFormation;
        this.visitorTeamFormationId = visitorTeamFormation;
    }
}