package se.jpdc.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import se.jpdc.didemo.services.GreetingService;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayHello();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}
