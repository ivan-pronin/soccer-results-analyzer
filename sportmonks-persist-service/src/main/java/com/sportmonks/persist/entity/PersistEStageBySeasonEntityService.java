package com.sportmonks.persist.entity;

import com.sportmonks.client.core.data.entity.Stage;
import com.sportmonks.client.rest.service.generic.IGetByIdOrSeasonRestDataService;
import com.sportmonks.persist.db.entity.EStage;
import com.sportmonks.persist.db.repository.ILeaguesRepository;
import com.sportmonks.persist.db.repository.ISeasonsRepository;
import com.sportmonks.persist.db.repository.IStagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersistEStageBySeasonEntityService implements IPersistBySeasonRestEntityService<EStage> {

    @Autowired
    private IStagesRepository stagesRepository;
    @Autowired
    private ILeaguesRepository leaguesRepository;
    @Autowired
    private ISeasonsRepository seasonsRepository;

    @Autowired
    private IGetByIdOrSeasonRestDataService<Stage> stagesRestService;

    @Override
    public void persistEntity(EStage entity) {

    }

    @Override
    public void persistAllEntities(long seasonId) {
//        List<Stage> stages = stagesRestService.getBySeasonId(seasonId);
//        Stage aStage = stages.get(0);
//        ELeague league = leaguesRepository.findByName(aStage.getName()).orElseThrow(IllegalArgumentException::new);
//        stages.stream().map(s -> new EStage(s, ))
        System.out.println("PersistEStageBySeasonEntityService.persistAllEntities");
    }
}
