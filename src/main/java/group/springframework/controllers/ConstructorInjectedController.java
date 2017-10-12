package group.springframework.controllers;

import org.springframework.stereotype.Controller;

import group.springframework.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
	this.greetingService = greetingService;
    }

    public String sayHello() {
	return greetingService.sayGreeting();
    }
}
