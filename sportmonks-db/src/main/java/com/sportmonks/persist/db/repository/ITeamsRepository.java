package com.sportmonks.persist.db.repository;

import com.sportmonks.persist.db.entity.ETeam;
import org.springframework.data.repository.CrudRepository;

public interface ITeamsRepository extends CrudRepository<ETeam, Long> {

}