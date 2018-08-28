package com.sportmonks.client.core.data.structure;

import com.fasterxml.jackson.annotation.*;
import com.sportmonks.client.core.data.entity.*;
import com.sportmonks.client.core.data.entity.StatsGoals;
import com.sportmonks.client.core.data.entity.StatsShots;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stats {

    @JsonProperty("data")
    private List<StatsData> data;

    public List<StatsData> getData() {
        return data;
    }

    public void setData(List<StatsData> data) {
        this.data = data;
    }
}