package com.sportmonks.client.core.data.structure;

import com.fasterxml.jackson.annotation.*;
import com.sportmonks.client.core.data.entity.Round;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class FixtureRound {

	@JsonProperty("data")
	private Round data;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("data")
	public Round getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(Round data) {
		this.data = data;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}