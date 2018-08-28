package com.sportmonks.persist.db.repository.fixture.stats;

import com.sportmonks.persist.db.entity.fixture.stats.EFixtureScores;
import org.springframework.data.repository.CrudRepository;

public interface IFixtureScoresRepository extends CrudRepository<EFixtureScores, Long> {

}