package se.jpdc.didemo.controllers;

import org.springframework.stereotype.Controller;
import se.jpdc.didemo.services.GreetingService;

@Controller
public class MyController {

    private GreetingService service;

    public MyController(GreetingService service) {
        this.service = service;
    }

    public String hello () {
        return service.sayHello();
    }

}
