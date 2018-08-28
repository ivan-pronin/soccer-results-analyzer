package com.sportmonks.persist.db.entity.fixture.stats;

import com.sportmonks.client.core.data.entity.StatsAttacks;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "attacks")
public class EAttacks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer attacks;
    @Column
    private Integer dangerousAttacks;

    @OneToOne
    @JoinColumn(name = "STATS_ID", nullable = false)
    private EStats stats;

    public EAttacks() {
    }

    public EAttacks(EStats stats, StatsAttacks attacks) {
        this.stats = stats;
        this.attacks = attacks.getAttacks();
        this.dangerousAttacks = attacks.getDangerousAttacks();
    }

    public Long getId() {
        return id;
    }

    public Integer getAttacks() {
        return attacks;
    }

    public Integer getDangerousAttacks() {
        return dangerousAttacks;
    }

    public EStats getStats() {
        return stats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EAttacks other = (EAttacks) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
