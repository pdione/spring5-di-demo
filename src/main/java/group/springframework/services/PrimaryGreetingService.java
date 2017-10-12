package group.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author pdione
 *
 */
@Service
@Primary
@Profile({ "en", "default" })
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {

	return "Hello - Primary greeting service";
    }

}
