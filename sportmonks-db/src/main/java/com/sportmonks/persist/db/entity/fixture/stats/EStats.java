package com.sportmonks.persist.db.entity.fixture.stats;

import com.sportmonks.client.core.data.structure.StatsData;
import com.sportmonks.persist.db.entity.ETeam;
import com.sportmonks.persist.db.entity.fixture.EFixture;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "stats")
public class EStats {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "TEAM_ID", nullable = false)
    private ETeam team;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FIXTURE_ID", nullable = false)
    private EFixture fixture;

    @OneToOne(mappedBy = "stats")
    private EShots shots;

    @OneToOne(mappedBy = "stats")
    private EPasses passes;

    @OneToOne(mappedBy = "stats")
    private EAttacks attacks;

    @Column
    private Integer fouls;
    @Column
    private Integer corners;
    @Column
    private Integer offsides;
    @Column
    private Integer redCards;
    @Column
    private Integer saves;
    @Column
    private Integer substitutions;

    public EStats() {
    }

    public EStats(EFixture fixture, ETeam team, StatsData data) {
        this.fixture = fixture;
        this.team = team;
        this.fouls = data.getFouls();
        this.corners = data.getCorners();
        this.offsides = data.getOffsides();
        this.redCards = data.getRedCards();
        this.saves = data.getSaves();
        this.substitutions = data.getSubstitutions();
    }

    public Long getId() {
        return id;
    }

    public ETeam getTeam() {
        return team;
    }

    public EFixture getFixture() {
        return fixture;
    }

    public EShots getShots() {
        return shots;
    }

    public EPasses getPasses() {
        return passes;
    }

    public EAttacks getAttacks() {
        return attacks;
    }

    public Integer getFouls() {
        return fouls;
    }

    public Integer getCorners() {
        return corners;
    }

    public Integer getOffsides() {
        return offsides;
    }

    public Integer getRedCards() {
        return redCards;
    }

    public Integer getSaves() {
        return saves;
    }

    public Integer getSubstitutions() {
        return substitutions;
    }

    public void setShots(EShots shots) {
        this.shots = shots;
    }

    public void setPasses(EPasses passes) {
        this.passes = passes;
    }

    public void setAttacks(EAttacks attacks) {
        this.attacks = attacks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EStats other = (EStats) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
