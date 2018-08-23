package com.sportmonks.results;

import com.sportmonks.persist.db.entity.EContinent;
import com.sportmonks.persist.db.entity.ECountry;
import com.sportmonks.persist.entity.IPersistByIdRestEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersistRestServiceHelper {

    @Autowired
    private IPersistByIdRestEntityService<EContinent> continentPersisrService;

    @Autowired
    private IPersistByIdRestEntityService<ECountry> countryPersistService;

    public void persistContinents() {
        continentPersisrService.persistAllEntities();
    }

    public void persistCountries() {
        countryPersistService.persistAllEntities();
    }

}
