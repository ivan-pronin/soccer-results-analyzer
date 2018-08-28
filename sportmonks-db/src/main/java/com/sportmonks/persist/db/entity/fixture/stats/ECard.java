package com.sportmonks.persist.db.entity.fixture.stats;

import com.sportmonks.client.core.data.entity.Card;
import com.sportmonks.persist.db.entity.ETeam;
import com.sportmonks.persist.db.entity.fixture.EFixture;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "card")
public class ECard {

    @Id
    private Long id;
    @Column
    private String type;
    @Column
    private Integer playerId;
    @Column
    private String playerName;
    @Column
    private Integer minute;
    @Column
    private String extraMinute;
    @Column
    private String reason;

    @OneToOne
    @JoinColumn(name = "TEAM_ID")
    private ETeam team;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "FIXTURE_ID", nullable = false)
    private EFixture fixture;

    public ECard() {
    }

    public ECard(EFixture fixture, ETeam team, Card card) {
        this.fixture = fixture;
        this.team = team;
        this.id = card.getId();
        this.type = card.getType();
        this.playerId = card.getPlayerId();
        this.playerName = card.getPlayerName();
        this.minute = card.getMinute();
        this.extraMinute = card.getExtraMinute();
        this.reason = card.getReason();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ECard other = (ECard) o;
        return Objects.equals(id, other.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
