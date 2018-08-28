package com.sportmonks.persist.db.entity.fixture.conditions;

import com.sportmonks.client.core.data.entity.FixtureCoaches;
import com.sportmonks.persist.db.entity.fixture.EFixture;

import javax.persistence.*;

@Entity
@Table(name = "fixture_coaches")
public class EFixtureCoaches {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private Integer localTeamCoachId;
    @Column
    private Integer visitorTeamCoachId;

    @OneToOne
    @JoinColumn(name = "FIXTURE_ID", nullable = false)
    private EFixture fixture;

    public EFixtureCoaches() {
    }

    public EFixtureCoaches(EFixture fixture, FixtureCoaches fixtureCoaches) {
        this.fixture = fixture;
        this.localTeamCoachId = fixtureCoaches.getLocalTeamCoachId();
        this.visitorTeamCoachId = fixtureCoaches.getVisitorTeamCoachId();
    }

    public EFixture getFixture() {
        return fixture;
    }

    public void setFixture(EFixture fixture) {
        this.fixture = fixture;
    }
}
