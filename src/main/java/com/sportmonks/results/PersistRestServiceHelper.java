package com.sportmonks.results;

import com.sportmonks.persist.db.entity.*;
import com.sportmonks.persist.entity.IPersistByIdRestEntityService;
import com.sportmonks.persist.entity.IPersistBySeasonRestEntityService;
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
    @Autowired
    private IPersistBySeasonRestEntityService<EStage> stagePersistService;
    @Autowired
    private IPersistBySeasonRestEntityService<ERound> roundPersistService;
    @Autowired
    private IPersistBySeasonRestEntityService<EVenue> venuePersistService;
    @Autowired
    private IPersistBySeasonRestEntityService<ETeam> teamPersistService;

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

    public void persistStages() {
        stagePersistService.persistAllEntities(0L);
    }

    public void persistRounds() {
        roundPersistService.persistAllEntities(0L);
    }

    public void persistVenues() {
        venuePersistService.persistAllEntities(0L);
    }

    public void persistTeams() {
        teamPersistService.persistAllEntities(0L);
    }
}
