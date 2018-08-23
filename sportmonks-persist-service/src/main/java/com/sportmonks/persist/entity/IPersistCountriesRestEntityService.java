package com.sportmonks.persist.entity;

import com.sportmonks.client.core.data.entity.Country;
import com.sportmonks.client.rest.service.generic.IGetByIdOrAllRestDataService;
import com.sportmonks.persist.db.entity.ECountry;
import com.sportmonks.persist.db.repository.ICountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class IPersistCountriesRestEntityService implements IPersistByIdRestEntityService<ECountry> {

    @Autowired
    private ICountriesRepository repository;
    @Autowired
    private IGetByIdOrAllRestDataService<Country> restDataService;

    @Override
    public void persistEntity(ECountry entity) {
    }

    @Override
    public void persistAllEntities() {
        List<Country> entities = restDataService.getAll();
        List<ECountry> eEntities = entities.stream().map(ECountry::new).collect(Collectors.toList());
        repository.saveAll(eEntities);
    }
}
