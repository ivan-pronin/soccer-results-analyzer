package com.sportmonks.client.core.data.entity;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "type", "fixture_id", "player_id", "player_name", "player_assist_id", "player_assist_name", "minute", "extra_minute"})
public class Goal {

    @JsonProperty
    private Long id;
    @JsonProperty
    private String type;
    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("fixture_id")
    private Long fixtureId;
    @JsonProperty("player_id")
    private Long playerId;
    @JsonProperty("player_name")
    private String playerName;
    @JsonProperty("player_assist_id")
    private Integer playerAssistId;
    @JsonProperty("player_assist_name")
    private String playerAssistName;
    @JsonProperty
    private Integer minute;
    @JsonProperty("extra_minute")
    private Integer extraMinute;
    @JsonProperty
    private String reason;
    @JsonProperty
    private String result;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<>();

    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("fixture_id")
    public Long getFixtureId() {
        return fixtureId;
    }

    @JsonProperty("fixture_id")
    public void setFixtureId(Long fixtureId) {
        this.fixtureId = fixtureId;
    }

    @JsonProperty("player_id")
    public Long getPlayerId() {
        return playerId;
    }

    @JsonProperty("player_id")
    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    @JsonProperty("player_name")
    public String getPlayerName() {
        return playerName;
    }

    @JsonProperty("player_name")
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @JsonProperty("player_assist_id")
    public Integer getPlayerAssistId() {
        return playerAssistId;
    }

    @JsonProperty("player_assist_id")
    public void setPlayerAssistId(Integer playerAssistId) {
        this.playerAssistId = playerAssistId;
    }

    @JsonProperty("player_assist_name")
    public String getPlayerAssistName() {
        return playerAssistName;
    }

    @JsonProperty("player_assist_name")
    public void setPlayerAssistName(String playerAssistName) {
        this.playerAssistName = playerAssistName;
    }

    @JsonProperty("minute")
    public Integer getMinute() {
        return minute;
    }

    @JsonProperty("minute")
    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    @JsonProperty("extra_minute")
    public Integer getExtraMinute() {
        return extraMinute;
    }

    @JsonProperty("extra_minute")
    public void setExtraMinute(Integer extraMinute) {
        this.extraMinute = extraMinute;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String getReason() {
        return reason;
    }

    public String getResult() {
        return result;
    }
}
