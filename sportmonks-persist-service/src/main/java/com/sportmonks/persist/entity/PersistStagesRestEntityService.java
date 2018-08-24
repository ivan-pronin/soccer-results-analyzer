package com.sportmonks.persist.entity;

import com.sportmonks.client.core.data.entity.Stage;
import com.sportmonks.client.rest.service.generic.IGetByIdOrSeasonRestDataService;
import com.sportmonks.persist.db.entity.ELeague;
import com.sportmonks.persist.db.entity.ESeason;
import com.sportmonks.persist.db.entity.EStage;
import com.sportmonks.persist.db.repository.ILeaguesRepository;
import com.sportmonks.persist.db.repository.ISeasonsRepository;
import com.sportmonks.persist.db.repository.IStagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersistStagesRestEntityService implements IPersistBySeasonRestEntityService<EStage> {

    @Autowired
    private IStagesRepository repository;
    @Autowired
    private ILeaguesRepository leaguesRepository;
    @Autowired
    private ISeasonsRepository seasonsRepository;

    @Autowired
    private IGetByIdOrSeasonRestDataService<Stage> restDataService;

    @Override
    public void persistEntity(EStage entity) {

    }

    @Override
    public void persistAllEntities(long seasonId) {
        Iterable<ESeason> seasons = seasonsRepository.findAll();
        seasons.forEach(season -> {
            List<Stage> restStages = restDataService.getBySeasonId(season.getId());
            ELeague league = season.getLeague();
            List<EStage> eStageList = restStages.stream().map(stage -> new EStage(stage, league, season)).collect(Collectors.toList());
            repository.saveAll(eStageList);
        });
    }
}
