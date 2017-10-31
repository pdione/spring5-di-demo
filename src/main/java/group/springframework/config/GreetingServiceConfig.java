package group.springframework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import group.springframework.services.GreetingRepository;
import group.springframework.services.GreetingService;
import group.springframework.services.GreetingServiceFactory;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory greetingServiceFactory(GreetingRepository greetingRepository) {
	return new GreetingServiceFactory(greetingRepository);
    }

    @Bean
    @Primary
    @Profile({ "default", "en" })
    GreetingService primaryGreetingService(GreetingServiceFactory greetingServiceFactory) {
	return greetingServiceFactory.createGreetingSevice("en");
    }

    @Bean
    @Primary
    @Profile("es")
    GreetingService primarySpanishGreetingService(GreetingServiceFactory greetingServiceFactory) {
	return greetingServiceFactory.createGreetingSevice("es");
    }

    @Bean
    @Primary
    @Profile("de")
    GreetingService primaryGermanGreetingService(GreetingServiceFactory greetingServiceFactory) {
	return greetingServiceFactory.createGreetingSevice("de");
    }
}
