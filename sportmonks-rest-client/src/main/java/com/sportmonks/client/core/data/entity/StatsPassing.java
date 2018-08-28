package com.sportmonks.client.core.data.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class StatsPassing {

    private Integer total;
    private Integer accurate;
    private Integer percentage;

    public Integer getTotal() {
        return total;
    }

    public Integer getAccurate() {
        return accurate;
    }

    public Integer getPercentage() {
        return percentage;
    }
}