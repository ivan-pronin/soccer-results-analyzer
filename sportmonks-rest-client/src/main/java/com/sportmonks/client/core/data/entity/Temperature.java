package com.sportmonks.client.core.data.entity;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "temp", "unit" })
public class Temperature {

	@JsonProperty("temp")
	private Double temp;
	@JsonProperty("unit")
	private String unit;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("temp")
	public Double getTemp() {
		return temp;
	}

	@JsonProperty("temp")
	public void setTemp(Double temp) {
		this.temp = temp;
	}

	@JsonProperty("unit")
	public String getUnit() {
		return unit;
	}

	@JsonProperty("unit")
	public void setUnit(String unit) {
		this.unit = unit;
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