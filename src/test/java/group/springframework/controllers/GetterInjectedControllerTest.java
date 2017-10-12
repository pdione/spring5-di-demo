package group.springframework.controllers;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import group.springframework.services.GreetingServiceImpl;

public class GetterInjectedControllerTest {

    private GetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
	this.setterInjectedController = new GetterInjectedController();
	this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception {
	assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }

}
