package com.sportmonks.persist.entity;

import com.sportmonks.client.core.data.entity.*;
import com.sportmonks.client.core.data.structure.StatsData;
import com.sportmonks.client.rest.service.IFixturesRestDataService;
import com.sportmonks.persist.db.entity.*;
import com.sportmonks.persist.db.entity.fixture.EFixture;
import com.sportmonks.persist.db.entity.fixture.conditions.*;
import com.sportmonks.persist.db.entity.fixture.stats.*;
import com.sportmonks.persist.db.repository.*;
import com.sportmonks.persist.db.repository.fixture.IFixturesRepository;
import com.sportmonks.persist.db.repository.fixture.conditions.*;
import com.sportmonks.persist.db.repository.fixture.stats.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class PersistFixturesRestEntityService implements IPersistFixturesRestEntityService {

    @Autowired
    private IFixturesRepository repository;
    @Autowired
    private ILeaguesRepository leaguesRepository;
    @Autowired
    private ISeasonsRepository seasonsRepository;
    @Autowired
    private IStagesRepository stagesRepository;
    @Autowired
    private IRoundsRepository roundsRepository;
    @Autowired
    private IVenuesRepository venuesRepository;
    @Autowired
    private ITeamsRepository teamsRepository;
    @Autowired
    private IWeatherReportsRepository weatherReportsRepository;
    @Autowired
    private IFormationsRepository formationsRepository;
    @Autowired
    private IFixtureFormationsRepository fixtureFormationsRepository;
    @Autowired
    private IFixtureScoresRepository fixtureScoresRepository;
    @Autowired
    private IFixtureTimesRepository fixtureTimesRepository;
    @Autowired
    private IFixtureCoachesRepository fixtureCoachesRepository;
    @Autowired
    private IFixtureStandingsRepository fixtureStandingsRepository;
    @Autowired
    private IFixtureGoalsRepository fixtureGoalsRepository;
    @Autowired
    private IFixtureCardsRepository fixtureCardsRepository;
    @Autowired
    private IFixtureCornersRepository fixtureCornersRepository;
    @Autowired
    private IFixtureStatsRepository fixtureStatsRepository;
    @Autowired
    private IStatsAttacksRepository statsAttacksRepository;
    @Autowired
    private IStatsPassesRepository statsPassesRepository;
    @Autowired
    private IStatsShotsRepository statsShotsRepository;


    @Autowired
    private IFixturesRestDataService restDataService;

    @Override
    public void persistEntity(Fixture fixture) {
        Fixture retrievedFixture = restDataService.getById(1871899L, "stats,goals,corners,cards").orElse(null);
        long fixtureId = retrievedFixture.getId();
        ELeague league = unwrapOptional(leaguesRepository.findById(retrievedFixture.getLeagueId()));
        ESeason season = unwrapOptional(seasonsRepository.findById(retrievedFixture.getSeasonId()));
        EStage stage = unwrapOptional(stagesRepository.findById(retrievedFixture.getStageId()));
        ERound round = unwrapOptional(roundsRepository.findById(retrievedFixture.getRoundId()));
        EVenue venue = unwrapOptional(venuesRepository.findById(retrievedFixture.getVenueId()));
        ETeam localTeam = unwrapOptional(teamsRepository.findById(retrievedFixture.getLocalteamId()));
        ETeam visitorTeam = unwrapOptional(teamsRepository.findById(retrievedFixture.getVisitorteamId()));

        EFixture eFixture = new EFixture(retrievedFixture, league, season, stage, round, venue, localTeam, visitorTeam);
        repository.save(eFixture);

        EWeatherReport weatherReport = new EWeatherReport(eFixture, retrievedFixture.getWeatherReport());
        eFixture.setWeatherReport(weatherReport);
        weatherReportsRepository.save(weatherReport);

        FixtureFormations formations = retrievedFixture.getFormations();
        String localteamFormation = formations.getLocalteamFormation();
        String visitorteamFormation = formations.getVisitorteamFormation();
        EFormation localTeamFormation = getFormation(localteamFormation);
        EFormation visitorTeamFormation = getFormation(visitorteamFormation);
        EFixtureFormations fixtureFormations = new EFixtureFormations(eFixture, localTeamFormation, visitorTeamFormation);
        eFixture.setFormations(fixtureFormations);
        fixtureFormationsRepository.save(fixtureFormations);

        EFixtureScores fixtureScores = new EFixtureScores(eFixture, retrievedFixture.getScores());
        eFixture.setScores(fixtureScores);
        fixtureScoresRepository.save(fixtureScores);

        EFixtureTime fixtureTime = new EFixtureTime(eFixture, retrievedFixture.getTime());
        eFixture.setTime(fixtureTime);
        fixtureTimesRepository.save(fixtureTime);

        EFixtureCoaches fixtureCoaches = new EFixtureCoaches(eFixture, retrievedFixture.getCoaches());
        eFixture.setCoaches(fixtureCoaches);
        fixtureCoachesRepository.save(fixtureCoaches);

        EFixtureStandings fixtureStandings = new EFixtureStandings(eFixture, retrievedFixture.getStandings());
        eFixture.setStandings(fixtureStandings);
        fixtureStandingsRepository.save(fixtureStandings);

        Set<EGoal> eGoals = retrievedFixture.getGoals().getData().stream().map(goal -> createEgoal(eFixture, goal, goal.getTeamId())).collect(Collectors.toSet());
        eFixture.setGoals(eGoals);
        fixtureGoalsRepository.saveAll(eGoals);

        Set<ECard> eCards = retrievedFixture.getCards().getData().stream().map(card -> createEcard(eFixture, card, card.getTeamId())).collect(Collectors.toSet());
        eFixture.setCards(eCards);
        fixtureCardsRepository.saveAll(eCards);

        Set<ECorner> eCorners = retrievedFixture.getCorners().getData().stream().map(corner -> createEcorner(eFixture, corner, corner.getTeamId())).collect(Collectors.toSet());
        eFixture.setCorners(eCorners);
        fixtureCornersRepository.saveAll(eCorners);

        Set<EStats> eStats = retrievedFixture.getStats().getData().stream().map(statsData -> createEstats(eFixture, statsData)).collect(Collectors.toSet());
        eFixture.setStats(eStats);

        repository.save(eFixture);
    }

    private EStats createEstats(EFixture eFixture, StatsData statsData) {
        EStats eStats = new EStats(eFixture, getTeam("" + statsData.getTeamId()), statsData);
        fixtureStatsRepository.save(eStats);
        EAttacks eAttacks = new EAttacks(eStats, statsData.getAttacks());
        statsAttacksRepository.save(eAttacks);
        EShots eShots = new EShots(eStats, statsData.getShots());
        statsShotsRepository.save(eShots);
        EPasses ePasses = new EPasses(eStats, statsData.getPasses());
        statsPassesRepository.save(ePasses);
        return eStats;
    }

    private EGoal createEgoal(EFixture eFixture, Goal goal, String teamId) {
        return new EGoal(eFixture, getTeam(teamId), goal);
    }

    private ECard createEcard(EFixture eFixture, Card card, String teamId) {
        return new ECard(eFixture, getTeam(teamId), card);
    }

    private ECorner createEcorner(EFixture eFixture, Corner corner, Long teamId) {
        return new ECorner(eFixture, getTeam("" + teamId), corner);
    }

    private ETeam getTeam(String teamId) {
        return teamsRepository.findById(Long.parseLong(teamId)).orElse(null);
    }

    private EFormation getFormation(String formationName) {
        EFormation formation = formationsRepository.findByName(formationName).orElse(null);
        if (formation == null) {
            formation = new EFormation(formationName);
            formationsRepository.save(formation);
        }
        return formation;
    }

    private <T> T unwrapOptional(Optional<T> optional) {
        return optional.orElse(null);
    }
}
