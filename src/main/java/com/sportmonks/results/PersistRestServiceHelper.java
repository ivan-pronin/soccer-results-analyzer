package com.sportmonks.results;

import com.sportmonks.persist.db.entity.EContinent;
import com.sportmonks.persist.db.entity.ECountry;
import com.sportmonks.persist.db.entity.ELeague;
import com.sportmonks.persist.db.entity.ESeason;
import com.sportmonks.persist.entity.IPersistByIdRestEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class PersistRestServiceHelper {

    @Autowired
    private IPersistByIdRestEntityService<EContinent> continentPersisrService;
    @Autowired
    private IPersistByIdRestEntityService<ECountry> countryPersistService;
    @Autowired
    private IPersistByIdRestEntityService<ELeague> leaguePersistService;
    @Autowired
    private IPersistByIdRestEntityService<ESeason> seasonPersistService;

    public void persistContinents() {
        continentPersisrService.persistAllEntities();
    }

    public void persistCountries() {
        countryPersistService.persistAllEntities();
    }

    public void persistLeagues() {
        leaguePersistService.persistAllEntities();
    }

    public void persistSeasons() {
        seasonPersistService.persistAllEntities();
    }
}
