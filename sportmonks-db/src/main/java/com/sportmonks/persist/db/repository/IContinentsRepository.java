package com.sportmonks.persist.db.repository;

import com.sportmonks.persist.db.entity.EContinent;
import org.springframework.data.repository.CrudRepository;

public interface IContinentsRepository extends CrudRepository<EContinent, Long> {

}