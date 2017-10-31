package group.springframework.services;

/**
 * @author pdione
 *
 */
public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
	super();
	this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
	return greetingRepository.getEnglishGreeting();
    }
}
