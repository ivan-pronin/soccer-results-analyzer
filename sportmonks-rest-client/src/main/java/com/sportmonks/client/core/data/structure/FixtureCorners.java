package com.sportmonks.client.core.data.structure;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sportmonks.client.core.data.entity.Corner;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"data"})
public class FixtureCorners {

    @JsonProperty
    private List<Corner> data;

    public List<Corner> getData() {
        return data;
    }

    public void setData(List<Corner> data) {
        this.data = data;
    }
}