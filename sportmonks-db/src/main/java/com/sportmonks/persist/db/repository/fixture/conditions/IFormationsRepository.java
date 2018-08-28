package com.sportmonks.persist.db.repository.fixture.conditions;

import com.sportmonks.persist.db.entity.fixture.conditions.EFormation;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IFormationsRepository extends CrudRepository<EFormation, Long> {

    Optional<EFormation> findByName(String name);
}