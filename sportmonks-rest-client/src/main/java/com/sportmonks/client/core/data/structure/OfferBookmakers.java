package com.sportmonks.client.core.data.structure;

import com.fasterxml.jackson.annotation.*;
import com.sportmonks.client.core.data.entity.OfferBookmaker;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "data" })
public class OfferBookmakers {

	@JsonProperty("data")
	private List<OfferBookmaker> data = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("data")
	public List<OfferBookmaker> getData() {
		return data;
	}

	@JsonProperty("data")
	public void setData(List<OfferBookmaker> data) {
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