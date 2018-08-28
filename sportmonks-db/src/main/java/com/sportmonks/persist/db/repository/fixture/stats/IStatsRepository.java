package com.sportmonks.persist.db.repository.fixture.stats;

import com.sportmonks.persist.db.entity.fixture.stats.EStats;
import org.springframework.data.repository.CrudRepository;

public interface IStatsRepository extends CrudRepository<EStats, Long> {

}