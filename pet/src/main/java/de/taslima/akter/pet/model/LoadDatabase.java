package de.taslima.akter.pet.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class LoadDatabase {
    private static final Logger log= LoggerFactory.getLogger(LoadDatabase.class);
    @Bean
    CommandLineRunner initDatabase(CustomerRepository repository){
        return args -> {
            log.info("Preloading Data"+ repository.save(new Customer(111,"Customer A", "address A", "15-01-20")));
        };
    }
}
