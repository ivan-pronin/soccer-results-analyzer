package com.sportmonks.client.core.data.entity;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.sportmonks.client.core.data.structure.Continents;
import com.sportmonks.client.core.data.structure.Leagues;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "id", "name", "extra", "continent", "leagues" })
public class Country {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("extra")
	@JsonDeserialize()
	private CountryExtra extra;
	@JsonProperty("continent")
	private Continents continent;
	@JsonProperty("leagues")
	private Leagues leagues;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("extra")
	public CountryExtra getExtra() {
		return extra;
	}

	@JsonProperty("extra")
	public void setExtra(CountryExtra extra) {
		this.extra = extra;
	}

	@JsonProperty("continent")
	public Continents getContinent() {
		return continent;
	}

	@JsonProperty("continent")
	public void setContinent(Continents continent) {
		this.continent = continent;
	}

	@JsonProperty("leagues")
	public Leagues getLeagues() {
		return leagues;
	}

	@JsonProperty("leagues")
	public void setLeagues(Leagues leagues) {
		this.leagues = leagues;
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