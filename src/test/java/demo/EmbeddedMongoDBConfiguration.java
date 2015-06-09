package demo;

import com.github.fakemongo.Fongo;
import com.mongodb.Mongo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmbeddedMongoDBConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmbeddedMongoDBConfiguration.class);

    @Bean
    Mongo mongo() {
        LOGGER.info("Using in-memory mongo");
        return new Fongo("mongo").getMongo();
    }

}