package group.springframework.controllers;

import org.springframework.stereotype.Controller;

import group.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
	super();
	this.greetingService = greetingService;
    }

    public String hello() {
	System.out.println("Hello!!! ");
	return greetingService.sayGreeting();
    }
}
