package com.sportmonks.persist.db.repository.fixture;

import com.sportmonks.persist.db.entity.fixture.EFixture;
import org.springframework.data.repository.CrudRepository;

public interface IFixturesRepository extends CrudRepository<EFixture, Long> {

}