package com.sportmonks.persist.entity;

import com.sportmonks.client.core.data.entity.Team;
import com.sportmonks.client.rest.service.generic.IGetByIdOrSeasonRestDataService;
import com.sportmonks.persist.db.entity.ECountry;
import com.sportmonks.persist.db.entity.ESeason;
import com.sportmonks.persist.db.entity.ETeam;
import com.sportmonks.persist.db.entity.EVenue;
import com.sportmonks.persist.db.repository.ICountriesRepository;
import com.sportmonks.persist.db.repository.ISeasonsRepository;
import com.sportmonks.persist.db.repository.ITeamsRepository;
import com.sportmonks.persist.db.repository.IVenuesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersistTeamsRestEntityService implements IPersistBySeasonRestEntityService<ETeam> {

    @Autowired
    private ITeamsRepository repository;
    @Autowired
    private ISeasonsRepository seasonsRepository;
    @Autowired
    private ICountriesRepository countriesRepository;
    @Autowired
    private IVenuesRepository venuesRepository;

    @Autowired
    private IGetByIdOrSeasonRestDataService<Team> restDataService;

    @Override
    public void persistEntity(ETeam entity) {

    }

    @Override
    public void persistAllEntities(long seasonId) {
        Iterable<ESeason> seasons = seasonsRepository.findAll();
        seasons.forEach(season -> {
            ECountry country = season.getLeague().getCountry();
            List<Team> restTeams = restDataService.getBySeasonId(season.getId());
            restTeams.forEach(team -> {
                EVenue venue = venuesRepository.findById(team.getVenueId()).orElse(null);
                repository.save(new ETeam(team, country, venue));
            });
        });
    }
}
