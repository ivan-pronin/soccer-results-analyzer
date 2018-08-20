package com.sportmonks.results;

import com.sportmonks.client.rest.SportmonksRestClientConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({SportmonksRestClientConfiguration.class})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
