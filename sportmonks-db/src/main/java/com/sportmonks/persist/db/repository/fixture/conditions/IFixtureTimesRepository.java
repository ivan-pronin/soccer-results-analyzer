package com.sportmonks.persist.db.repository.fixture.conditions;

import com.sportmonks.persist.db.entity.fixture.conditions.EFixtureTime;
import org.springframework.data.repository.CrudRepository;

public interface IFixtureTimesRepository extends CrudRepository<EFixtureTime, Long> {

}