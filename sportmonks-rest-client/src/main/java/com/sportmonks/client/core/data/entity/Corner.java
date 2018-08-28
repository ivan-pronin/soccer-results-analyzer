package com.sportmonks.client.core.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Corner {

    @JsonProperty
    private Long id;
    @JsonProperty("team_id")
    private Long teamId;
    @JsonProperty("fixture_id")
    private Long fixtureId;
    @JsonProperty
    private Integer minute;
    @JsonProperty("extra_minute")
    private Integer extraMinute;
    @JsonProperty
    private String comment;

    public Long getId() {
        return id;
    }

    public Long getTeamId() {
        return teamId;
    }

    public Long getFixtureId() {
        return fixtureId;
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
}
