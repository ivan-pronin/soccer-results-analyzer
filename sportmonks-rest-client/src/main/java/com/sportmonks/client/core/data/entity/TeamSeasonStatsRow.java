package com.sportmonks.client.core.data.entity;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "total", "home", "away" })
public class TeamSeasonStatsRow {

	@JsonProperty("total")
	private Integer total;
	@JsonProperty("home")
	private Integer home;
	@JsonProperty("away")
	private Integer away;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	@JsonProperty("home")
	public Integer getHome() {
		return home;
	}

	@JsonProperty("home")
	public void setHome(Integer home) {
		this.home = home;
	}

	@JsonProperty("away")
	public Integer getAway() {
		return away;
	}

	@JsonProperty("away")
	public void setAway(Integer away) {
		this.away = away;
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