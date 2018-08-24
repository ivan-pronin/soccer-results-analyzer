package com.sportmonks.persist.entity;

import com.sportmonks.client.core.data.entity.Round;
import com.sportmonks.client.rest.service.generic.IGetByIdOrSeasonRestDataService;
import com.sportmonks.persist.db.entity.ELeague;
import com.sportmonks.persist.db.entity.ERound;
import com.sportmonks.persist.db.entity.ESeason;
import com.sportmonks.persist.db.entity.EStage;
import com.sportmonks.persist.db.repository.ILeaguesRepository;
import com.sportmonks.persist.db.repository.IRoundsRepository;
import com.sportmonks.persist.db.repository.ISeasonsRepository;
import com.sportmonks.persist.db.repository.IStagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersistRoundsRestEntityService implements IPersistBySeasonRestEntityService<ERound> {

    @Autowired
    private IRoundsRepository repository;
    @Autowired
    private ILeaguesRepository leaguesRepository;
    @Autowired
    private ISeasonsRepository seasonsRepository;
    @Autowired
    private IStagesRepository stagesRepository;

    @Autowired
    private IGetByIdOrSeasonRestDataService<Round> restDataService;

    @Override
    public void persistEntity(ERound entity) {

    }

    @Override
    public void persistAllEntities(long seasonId) {
        Iterable<EStage> stages = stagesRepository.findAll();
        stages.forEach(stage -> {
            ELeague league = stage.getLeague();
            ESeason season = stage.getSeason();
            List<Round> restRounds = restDataService.getBySeasonId(season.getId());
            List<ERound> eRounds = restRounds.stream().map(round -> new ERound(round, league, season, stage)).collect(Collectors.toList());
            repository.saveAll(eRounds);
        });
    }
}
