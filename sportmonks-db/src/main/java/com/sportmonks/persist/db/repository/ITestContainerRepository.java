package com.sportmonks.persist.db.repository;

import com.sportmonks.persist.db.entity.ETestContainer;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface ITestContainerRepository extends CrudRepository<ETestContainer, Long> {

    @EntityGraph(value = "ETestContainer.testObjs", type = EntityGraph.EntityGraphType.LOAD)
    ETestContainer findByName(String name);
}