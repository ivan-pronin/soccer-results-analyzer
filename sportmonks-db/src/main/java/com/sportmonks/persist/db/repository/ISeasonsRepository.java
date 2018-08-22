package com.sportmonks.persist.db.repository;

import com.sportmonks.persist.db.entity.ESeason;
import org.springframework.data.repository.CrudRepository;

public interface ISeasonsRepository extends CrudRepository<ESeason, Long> {

}