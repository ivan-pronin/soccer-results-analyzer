package com.sportmonks.persist.entity;

import com.sportmonks.client.core.data.entity.Venue;
import com.sportmonks.client.rest.service.generic.IGetByIdOrSeasonRestDataService;
import com.sportmonks.persist.db.entity.ESeason;
import com.sportmonks.persist.db.entity.EVenue;
import com.sportmonks.persist.db.repository.ISeasonsRepository;
import com.sportmonks.persist.db.repository.IVenuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersistVenuesRestEntityService implements IPersistBySeasonRestEntityService<EVenue> {

    @Autowired
    private IVenuesRepository repository;
    @Autowired
    private ISeasonsRepository helperRepository;
    @Autowired
    private IGetByIdOrSeasonRestDataService<Venue> restDataService;

    @Override
    public void persistEntity(EVenue entity) {
    }

    @Override
    public void persistAllEntities(long seasonId) {
        Iterable<ESeason> entities = helperRepository.findAll();
        entities.forEach(season -> {
            List<Venue> venues = restDataService.getBySeasonId(season.getId());
            List<EVenue> eVenues = venues.stream().map(EVenue::new).collect(Collectors.toList());
            repository.saveAll(eVenues);
        });
    }
}
