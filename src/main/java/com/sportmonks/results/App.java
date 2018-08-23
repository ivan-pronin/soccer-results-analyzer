package com.sportmonks.results;

import com.sportmonks.client.rest.SportmonksRestClientConfiguration;
import com.sportmonks.persist.SportmonksPersistServiceConfiguration;
import com.sportmonks.persist.db.DbConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

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

        persistRestDataService.persistContinents();
        persistRestDataService.persistCountries();
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
