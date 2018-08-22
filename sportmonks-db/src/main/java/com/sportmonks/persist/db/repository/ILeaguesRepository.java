package com.sportmonks.persist.db.repository;

import com.sportmonks.persist.db.entity.ELeague;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ILeaguesRepository extends CrudRepository<ELeague, Long> {

    Optional<ELeague> findByName(String name);
}