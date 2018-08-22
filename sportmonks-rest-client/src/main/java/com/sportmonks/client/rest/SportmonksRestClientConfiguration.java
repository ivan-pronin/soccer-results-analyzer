package com.sportmonks.client.rest;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sportmonks.client.rest.service.config.GetByIdOrAllRestConfiguration;
import com.sportmonks.client.rest.service.config.GetByIdOrSeasonRestConfiguration;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.function.Supplier;

@Configuration
@ComponentScan
@Import({GetByIdOrAllRestConfiguration.class, GetByIdOrSeasonRestConfiguration.class})
public class SportmonksRestClientConfiguration {

    private static final String API_URL = "https://soccer.sportmonks.com/api/";
    private static final String VERSION = "v2.0/";
    private static final String API_TOKEN = "01pV76Qt4NZe3ay5eRSaqq8cQl8objq2zjEqZc0YE7Sj7WbMkww3uoXBbq8s";

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS, true);
        return mapper;
    }

    @Bean
    public RestTemplateBuilder restTemplateBuilder() {
        return new RestTemplateBuilder();
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return new RestTemplate();
    }

    @Bean
    public Supplier<UriComponentsBuilder> uriComponentsBuilderSupplier() {
        return this::uriComponentsBuilder;
    }

    @Bean
    @Scope("prototype")
    UriComponentsBuilder uriComponentsBuilder() {
        return UriComponentsBuilder.fromUriString(API_URL + VERSION).queryParam("api_token", API_TOKEN);
    }
}
