package com.sportmonks.persist.db.repository;

import com.sportmonks.persist.db.entity.ECountry;
import org.springframework.data.repository.CrudRepository;

public interface ICountriesRepository extends CrudRepository<ECountry, Long> {

    ECountry findByName(String name);
}