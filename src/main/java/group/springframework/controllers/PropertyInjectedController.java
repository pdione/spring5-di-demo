package group.springframework.controllers;

import group.springframework.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String sayHello() {
	return greetingService.sayGreeting();
    }
}
