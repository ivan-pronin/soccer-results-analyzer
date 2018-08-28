package com.sportmonks.persist.db.entity.fixture.conditions;

import com.sportmonks.client.core.data.entity.Date;
import com.sportmonks.client.core.data.entity.FixtureTime;
import com.sportmonks.persist.db.entity.fixture.EFixture;

import javax.persistence.*;

@Entity
@Table(name = "fixture_time")
public class EFixtureTime {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String status;
    @Column
    private String dateTime;
    @Column
    private String date;
    @Column
    private String time;
    @Column
    private Integer timestamp;
    @Column
    private String timezone;
    @Column
    private Integer minute;
    @Column
    private Integer extraMinute;
    @Column
    private Integer injuryTime;

    @OneToOne
    @JoinColumn(name = "FIXTURE_ID", nullable = false)
    private EFixture fixture;

    public EFixtureTime() {
    }

    public EFixtureTime(EFixture fixture, FixtureTime fixtureTime) {
        this.fixture = fixture;
        this.status = fixtureTime.getStatus();
        Date startingAt = fixtureTime.getStartingAt();
        this.dateTime = startingAt.getDateTime();
        this.date = startingAt.getDate();
        this.time = startingAt.getTime();
        this.timestamp = startingAt.getTimestamp();
        this.timezone = startingAt.getTimezone();
        this.minute = fixtureTime.getMinute();
        this.extraMinute = fixtureTime.getExtraMinute();
        this.injuryTime = fixtureTime.getInjuryTime();
    }
}
