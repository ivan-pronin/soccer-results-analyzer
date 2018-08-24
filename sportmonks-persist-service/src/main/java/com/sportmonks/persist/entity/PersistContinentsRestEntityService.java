package com.sportmonks.persist.entity;

import com.sportmonks.client.core.data.entity.Continent;
import com.sportmonks.client.rest.service.generic.IGetByIdOrAllRestDataService;
import com.sportmonks.persist.db.entity.EContinent;
import com.sportmonks.persist.db.repository.IContinentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersistContinentsRestEntityService implements IPersistByIdRestEntityService<EContinent> {

    @Autowired
    IContinentsRepository repository;
    @Autowired
    IGetByIdOrAllRestDataService<Continent> restDataService;

    @Override
    public void persistEntity(EContinent entity) {
    }

    @Override
    public void persistAllEntities() {
        List<Continent> entities = restDataService.getAll();
        List<EContinent> eEntities = entities.stream().map(EContinent::new).collect(Collectors.toList());
        repository.saveAll(eEntities);
    }
}
