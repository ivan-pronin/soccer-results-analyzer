package com.sportmonks.persist.db.repository.fixture.conditions;

import com.sportmonks.persist.db.entity.fixture.conditions.EWeatherReport;
import org.springframework.data.repository.CrudRepository;

public interface IWeatherReportsRepository extends CrudRepository<EWeatherReport, Long> {

}