package com.sportmonks.persist.db.entity.fixture.stats;

import com.sportmonks.client.core.data.entity.StatsShots;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "shots")
public class EShots {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer total;
    @Column
    private Integer onGoal;
    @Column
    private Integer offGoal;
    @Column
    private Integer blocked;
    @Column
    private Integer insideBox;
    @Column
    private Integer outsideBox;

    @OneToOne
    @JoinColumn(name = "STATS_ID", nullable = false)
    private EStats stats;

    public EShots() {
    }

    public EShots(EStats stats, StatsShots shots) {
        this.stats = stats;
        this.total = shots.getTotal();
        this.onGoal = shots.getOnGoal();
        this.offGoal = shots.getOffGoal();
        this.blocked = shots.getBlocked();
        this.insideBox = shots.getInsideBox();
        this.outsideBox = shots.getOutsideBox();
    }

    public Long getId() {
        return id;
    }

    public Integer getTotal() {
        return total;
    }

    public Integer getOnGoal() {
        return onGoal;
    }

    public Integer getOffGoal() {
        return offGoal;
    }

    public Integer getBlocked() {
        return blocked;
    }

    public Integer getInsideBox() {
        return insideBox;
    }

    public Integer getOutsideBox() {
        return outsideBox;
    }

    public EStats getStats() {
        return stats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EShots other = (EShots) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
