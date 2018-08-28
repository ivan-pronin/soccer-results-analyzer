package com.sportmonks.client.core.data.entity;

/**
 * Created by KS on 06/06/2017.
 */

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FixtureStandings {

    @JsonProperty("localteam_position")
    private Integer localTeamPosition;
    @JsonProperty("visitorteam_position")
    private Integer visitorTeamPosition;

    public Integer getLocalTeamPosition() {
        return localTeamPosition;
    }

    public Integer getVisitorTeamPosition() {
        return visitorTeamPosition;
    }
}