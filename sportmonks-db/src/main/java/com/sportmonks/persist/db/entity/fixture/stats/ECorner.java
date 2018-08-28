package com.sportmonks.persist.db.entity.fixture.stats;

import com.sportmonks.client.core.data.entity.Corner;
import com.sportmonks.persist.db.entity.ETeam;
import com.sportmonks.persist.db.entity.fixture.EFixture;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "corner")
public class ECorner {

    @Id
    private Long id;
    @Column
    private Integer minute;
    @Column
    private Integer extraMinute;
    @Column
    private String comment;

    @OneToOne
    @JoinColumn(name = "TEAM_ID", nullable = false)
    private ETeam team;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FIXTURE_ID", nullable = false)
    private EFixture fixture;

    public ECorner() {
    }

    public ECorner(EFixture fixture, ETeam team, Corner corner) {
        this.fixture = fixture;
        this.team = team;
        this.id = corner.getId();
        this.minute = corner.getMinute();
        this.extraMinute = corner.getExtraMinute();
        this.comment = corner.getComment();
    }

    public Long getId() {
        return id;
    }

    public Integer getMinute() {
        return minute;
    }

    public Integer getExtraMinute() {
        return extraMinute;
    }

    public String getComment() {
        return comment;
    }

    public ETeam getTeam() {
        return team;
    }

    public EFixture getFixture() {
        return fixture;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ECorner other = (ECorner) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
