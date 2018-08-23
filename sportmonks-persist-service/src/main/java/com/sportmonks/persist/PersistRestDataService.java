package com.sportmonks.persist;

import com.sportmonks.persist.entity.IPersistBySeasonRestEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersistRestDataService implements IPersistDataService {

    @Autowired
    private List<IPersistBySeasonRestEntityService> entityServices;

    @Override
    public void persistAll() {
//        entityServices.forEach(IPersistBySeasonRestEntityService::persistAllEntities);
    }

    @Override
    public void persistAllBySeasonId(long seasonId) {

    }
}
