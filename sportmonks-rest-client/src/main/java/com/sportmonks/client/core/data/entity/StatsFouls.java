package com.sportmonks.client.core.data.entity;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "drawn", "committed" })
public class StatsFouls {

	@JsonProperty("drawn")
	private Object drawn;
	@JsonProperty("committed")
	private Object committed;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("drawn")
	public Object getDrawn() {
		return drawn;
	}

	@JsonProperty("drawn")
	public void setDrawn(Object drawn) {
		this.drawn = drawn;
	}

	@JsonProperty("committed")
	public Object getCommitted() {
		return committed;
	}

	@JsonProperty("committed")
	public void setCommitted(Object committed) {
		this.committed = committed;
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