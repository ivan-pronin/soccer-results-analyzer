package com.sportmonks.persist.db.repository;

import com.sportmonks.persist.db.entity.ERound;
import org.springframework.data.repository.CrudRepository;

public interface IRoundsRepository extends CrudRepository<ERound, Long> {

}