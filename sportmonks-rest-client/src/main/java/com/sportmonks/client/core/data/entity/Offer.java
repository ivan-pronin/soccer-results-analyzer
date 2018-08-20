package com.sportmonks.client.core.data.entity;

import com.fasterxml.jackson.annotation.*;
import com.sportmonks.client.core.data.structure.OfferBookmakers;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "name", "bookmaker" })
public class Offer {

	@JsonProperty("name")
	private String name;
	@JsonProperty("bookmaker")
	private OfferBookmakers bookmaker;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("bookmaker")
	public OfferBookmakers getBookmaker() {
		return bookmaker;
	}

	@JsonProperty("bookmaker")
	public void setBookmaker(OfferBookmakers bookmaker) {
		this.bookmaker = bookmaker;
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