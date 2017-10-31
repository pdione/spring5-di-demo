package group.springframework.services;

public class PrimarySpanishGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
	super();
	this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
	return greetingRepository.getSpanishGreeting();
    }
}
