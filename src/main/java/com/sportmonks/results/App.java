package com.sportmonks.results;

import com.sportmonks.client.rest.SportmonksRestClientConfiguration;
import com.sportmonks.persist.SportmonksPersistServiceConfiguration;
import com.sportmonks.persist.db.DbConfiguration;
import com.sportmonks.persist.db.entity.ETestContainer;
import com.sportmonks.persist.db.entity.ETestObj;
import com.sportmonks.persist.db.repository.ITestContainerRepository;
import com.sportmonks.persist.db.repository.ITestObjRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@Import({SportmonksRestClientConfiguration.class, DbConfiguration.class, SportmonksPersistServiceConfiguration.class})
public class App {

    private static final long DENMARK_LEAGUE_SPORTMONKS_ID = 271;
    private static final long SCOTLAND_LEAGUE_SPORTMONKS_ID = 501;
    private static final long DENMARK_LEAGUE_ID = 38;
    private static final String DENMARK = "Denmark";
    private static final String SCOTLAND = "Scotland";

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App.class);
        PersistRestServiceHelper persistRestDataService = context.getBean(PersistRestServiceHelper.class);

        ITestObjRepository testObjRepository = context.getBean(ITestObjRepository.class);
        ITestContainerRepository testContainerRepository = context.getBean(ITestContainerRepository.class);

        ETestContainer container = new ETestContainer("c1");
        List<ETestObj> objs = Arrays.asList(
                new ETestObj("t1", container),
                new ETestObj("t2", container)
        );

        container.setTestObjs(objs);

        ETestContainer byId = testContainerRepository.findById(132L).orElse(null);
        List<ETestObj> testObjs = byId.getTestObjs();
        System.out.println(testObjs.get(0));
        System.out.println(testObjs.get(1));

        System.out.println(testObjRepository.findById(133L).orElse(null));

        persistRestDataService.persistFixture(null);
//        testContainerRepository.save(container);
//        persistRestDataService.persistContinents();
//        persistRestDataService.persistCountries();
//        persistRestDataService.persistLeagues();
//        persistRestDataService.persistSeasons();
//        persistRestDataService.persistStages();
//        persistRestDataService.persistRounds();
//        persistRestDataService.persistVenues();
//        persistRestDataService.persistTeams();
//
//        IPersistDataService persistDataService = context.getBean(IPersistDataService.class);
//        persistDataService.persistAll();
//
//        ICountriesRepository countriesRepository = context.getBean(ICountriesRepository.class);
//        ECountry denmark = countriesRepository.findByName("Denmark");
//        ECountry scotland = countriesRepository.findByName("Scotland");
//        List<ELeague> leagues = Arrays.asList(
//                new ELeague(denmark, DENMARK_LEAGUE_SPORTMONKS_ID, "Superliga"),
//                new ELeague(scotland, SCOTLAND_LEAGUE_SPORTMONKS_ID, "Premiership")
//        );
//        ILeaguesRepository leaguesRepository = context.getBean(ILeaguesRepository.class);
////        leaguesRepository.saveAll(leagues);
//
//        IGetByIdOrAllRestDataService<Season> seasonsRestService = context.getBean("seasonIGetByIdOrAllRestDataService", IGetByIdOrAllRestDataService.class);
//        List<Season> seasons = seasonsRestService.getAll();
//
//        ELeague denmarkLeague = leaguesRepository.findByName("Superliga").orElseThrow(IllegalArgumentException::new);
//        ELeague scotlandLeague = leaguesRepository.findByName("Premiership").orElseThrow(IllegalArgumentException::new);
//
//        List<ESeason> denmarkseasons = seasons.stream().filter(s -> s.getLeagueId() == 271L).map(s -> new ESeason(s.getId(), s.getName(), denmarkLeague)).collect(Collectors.toList());
//        List<ESeason> scotlandSeasons = seasons.stream().filter(s -> s.getLeagueId() == 501L).map(s -> new ESeason(s.getId(), s.getName(), scotlandLeague)).collect(Collectors.toList());
//        ISeasonsRepository seasonsRepository = context.getBean(ISeasonsRepository.class);
//        seasonsRepository.saveAll(scotlandSeasons);

//        IGetByIdOrAllRestDataService<Continent> restDataService = context.getBean("continentIGetByIdOrAllRestDataService", IGetByIdOrAllRestDataService.class);
//        List<Continent> continents = restDataService.getAll();
//        System.out.println("Continents.size: " + continents.size());
//        IContinentsRepository continentsRepository = context.getBean(IContinentsRepository.class);
//        EContinent eContinent = new EContinent(100L, "TestContinent");
//        continentsRepository.save(eContinent);
//        Iterable<EContinent> continents = continentsRepository.findAll();
//        System.out.println("Continents.size: " + continents.iterator().hasNext());
//        List<EContinent> data = Arrays.asList(
//                new EContinent(102L, "TestContinent2"),
//                new EContinent(103L, "TestContinent3")
//        );
////        continentsRepository.saveAll(data);
//        List<ECountry> countries = Arrays.asList(
//                new ECountry(320L, "Denmark"),
//                new ECountry(1161L, "Scotland")
//        );

    }
}
