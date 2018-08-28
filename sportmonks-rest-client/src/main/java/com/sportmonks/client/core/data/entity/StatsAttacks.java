package com.sportmonks.client.core.data.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatsAttacks {

    private Integer attacks;
    @JsonProperty("dangerous_attacks")
    private Integer dangerousAttacks;

    public Integer getAttacks() {
        return attacks;
    }

    public Integer getDangerousAttacks() {
        return dangerousAttacks;
    }
}