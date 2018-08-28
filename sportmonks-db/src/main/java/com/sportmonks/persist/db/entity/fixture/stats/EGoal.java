package com.sportmonks.persist.db.entity.fixture.stats;

import com.sportmonks.client.core.data.entity.Goal;
import com.sportmonks.persist.db.entity.ETeam;
import com.sportmonks.persist.db.entity.fixture.EFixture;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "goal")
public class EGoal {

    @Id
    private Long id;
    @Column
    private String type;
    @Column
    private Long playerId;
    @Column
    private String playerName;
    @Column
    private Integer playerAssistId;
    @Column
    private String playerAssistName;
    @Column
    private Integer minute;
    @Column
    private Integer extraMinute;
    @Column
    private String reason;
    @Column
    private String result;

    @OneToOne
    @JoinColumn(name = "TEAM_ID")
    private ETeam team;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FIXTURE_ID", nullable = false)
    private EFixture fixture;

    public EGoal() {
    }

    public EGoal(EFixture fixture, ETeam team, Goal goal) {
        this.fixture = fixture;
        this.team = team;
        this.id = goal.getId();
        this.type = goal.getType();
        this.playerId = goal.getPlayerId();
        this.playerName = goal.getPlayerName();
        this.playerAssistId = goal.getPlayerAssistId();
        this.playerAssistName = goal.getPlayerAssistName();
        this.minute = goal.getMinute();
        this.extraMinute = goal.getExtraMinute();
        this.reason = goal.getReason();
        this.result = goal.getResult();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EGoal other = (EGoal) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
