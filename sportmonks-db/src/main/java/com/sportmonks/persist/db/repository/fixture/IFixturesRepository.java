package com.sportmonks.persist.db.repository.fixture;

import com.sportmonks.persist.db.entity.fixture.EFixture;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IFixturesRepository extends CrudRepository<EFixture, Long> {

    @EntityGraph(value = "EFixture.stats", type = EntityGraph.EntityGraphType.LOAD)
    Optional<EFixture> findById(long id);
}