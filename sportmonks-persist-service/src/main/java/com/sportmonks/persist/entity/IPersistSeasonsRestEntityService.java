package com.sportmonks.persist.entity;

import com.sportmonks.client.core.data.entity.Season;
import com.sportmonks.client.rest.service.generic.IGetByIdOrAllRestDataService;
import com.sportmonks.persist.db.entity.ESeason;
import com.sportmonks.persist.db.repository.ILeaguesRepository;
import com.sportmonks.persist.db.repository.ISeasonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class IPersistSeasonsRestEntityService implements IPersistByIdRestEntityService<ESeason> {

    @Autowired
    private ISeasonsRepository repository;
    @Autowired
    private ILeaguesRepository helperRepository;
    @Autowired
    private IGetByIdOrAllRestDataService<Season> restDataService;

    @Override
    public void persistEntity(ESeason entity) {
    }

    @Override
    public void persistAllEntities() {
        List<Season> entities = restDataService.getAll();
        List<ESeason> eEntities = entities.stream().map(season ->
                new ESeason(season, helperRepository.findById(season.getLeagueId()).get())).collect(Collectors.toList());
        repository.saveAll(eEntities);
    }
}
