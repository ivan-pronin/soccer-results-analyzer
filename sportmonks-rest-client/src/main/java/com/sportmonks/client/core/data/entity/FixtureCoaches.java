package com.sportmonks.client.core.data.entity;

/**
 * Created by KS on 06/06/2017.
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FixtureCoaches {

    @JsonProperty("localteam_coach_id")
    private Integer localTeamCoachId;
    @JsonProperty("visitorteam_coach_id")
    private Integer visitorTeamCoachId;

    public Integer getLocalTeamCoachId() {
        return localTeamCoachId;
    }

    public Integer getVisitorTeamCoachId() {
        return visitorTeamCoachId;
    }
}