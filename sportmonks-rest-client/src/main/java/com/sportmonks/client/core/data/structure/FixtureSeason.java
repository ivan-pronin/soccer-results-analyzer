package com.sportmonks.client.core.data.structure;

import com.fasterxml.jackson.annotation.*;
import com.sportmonks.client.core.data.entity.Season;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class FixtureSeason {

	@JsonProperty("data")
	private Season data;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("data")
	public Season getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(Season data) {
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