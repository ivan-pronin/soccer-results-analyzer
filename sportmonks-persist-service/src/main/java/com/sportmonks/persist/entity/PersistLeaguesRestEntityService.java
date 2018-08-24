package com.sportmonks.persist.entity;

import com.sportmonks.client.core.data.entity.League;
import com.sportmonks.client.rest.service.generic.IGetByIdOrAllRestDataService;
import com.sportmonks.persist.db.entity.ELeague;
import com.sportmonks.persist.db.repository.ICountriesRepository;
import com.sportmonks.persist.db.repository.ILeaguesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersistLeaguesRestEntityService implements IPersistByIdRestEntityService<ELeague> {

    @Autowired
    private ILeaguesRepository repository;
    @Autowired
    private ICountriesRepository countriesRepository;
    @Autowired
    private IGetByIdOrAllRestDataService<League> restDataService;

    @Override
    public void persistEntity(ELeague entity) {
    }

    @Override
    public void persistAllEntities() {
        List<League> entities = restDataService.getAll();
        List<ELeague> eEntities = entities.stream().map(league ->
                new ELeague(league, countriesRepository.findById(league.getCountryId()).orElseThrow(IllegalArgumentException::new))).collect(Collectors.toList());
        repository.saveAll(eEntities);
    }
}
