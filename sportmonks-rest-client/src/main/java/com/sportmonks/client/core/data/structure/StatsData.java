package com.sportmonks.client.core.data.structure;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sportmonks.client.core.data.entity.StatsAttacks;
import com.sportmonks.client.core.data.entity.StatsPassing;
import com.sportmonks.client.core.data.entity.StatsShots;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StatsData {

    @JsonProperty("team_id")
    private Integer teamId;
    @JsonProperty("fixture_id")
    private Long fixtureId;
    @JsonProperty("possessiontime")
    private Integer possessionTime;
    @JsonProperty("yellowcards")
    private Integer yellowCards;
    @JsonProperty("redcards")
    private Integer redCards;
    private StatsShots shots;
    private StatsPassing passes;
    private StatsAttacks attacks;
    private Integer fouls;
    private Integer corners;
    private Integer offsides;
    private Integer saves;
    private Integer substitutions;

    public Integer getTeamId() {
        return teamId;
    }

    public Long getFixtureId() {
        return fixtureId;
    }

    public Integer getPossessionTime() {
        return possessionTime;
    }

    public Integer getYellowCards() {
        return yellowCards;
    }

    public StatsShots getShots() {
        return shots;
    }

    public StatsPassing getPasses() {
        return passes;
    }

    public StatsAttacks getAttacks() {
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
}
