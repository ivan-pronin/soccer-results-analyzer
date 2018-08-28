package com.sportmonks.client.core.data.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatsShots {

    private Integer total;

    @JsonProperty("ongoal")
    private Integer onGoal;
    @JsonProperty("offgoal")
    private Integer offGoal;
    private Integer blocked;
    @JsonProperty("insidebox")
    private Integer insideBox;
    @JsonProperty("outsidebox")
    private Integer outsideBox;

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
}