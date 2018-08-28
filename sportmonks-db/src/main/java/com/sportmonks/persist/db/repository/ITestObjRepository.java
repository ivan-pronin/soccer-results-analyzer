package com.sportmonks.persist.db.repository;

import com.sportmonks.persist.db.entity.ETestObj;
import org.springframework.data.repository.CrudRepository;

public interface ITestObjRepository extends CrudRepository<ETestObj, Long> {

}