package com.sportmonks.persist.db.repository;

import com.sportmonks.persist.db.entity.EVenue;
import org.springframework.data.repository.CrudRepository;

public interface IVenuesRepository extends CrudRepository<EVenue, Long> {

}