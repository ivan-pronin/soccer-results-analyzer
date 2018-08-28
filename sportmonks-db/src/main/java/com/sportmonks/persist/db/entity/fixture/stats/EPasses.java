package com.sportmonks.persist.db.entity.fixture.stats;

import com.sportmonks.client.core.data.entity.StatsPassing;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "passes")
public class EPasses {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer total;
    @Column
    private Integer accurate;
    @Column
    private Integer percentage;

    @OneToOne
    @JoinColumn(name = "STATS_ID", nullable = false)
    private EStats stats;

    public EPasses() {
    }

    public EPasses(EStats stats, StatsPassing passing) {
        this.stats = stats;
        this.total = passing.getTotal();
        this.accurate = passing.getAccurate();
        this.percentage = passing.getPercentage();
    }

    public Long getId() {
        return id;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getAccurate() {
        return accurate;
    }

    public Integer getPercentage() {
        return percentage;
    }

    public EStats getStats() {
        return stats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EPasses other = (EPasses) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
