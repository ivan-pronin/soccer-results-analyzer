package com.sportmonks.client.core.data.structure;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sportmonks.client.core.data.entity.StandingRow;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class StandingRows {

	@JsonProperty("data")
	private List<StandingRow> data = null;

	@JsonProperty("data")
	public List<StandingRow> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<StandingRow> data) {
		this.data = data;
	}

}