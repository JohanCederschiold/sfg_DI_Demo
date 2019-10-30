package se.jpdc.didemo.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class GreetingServiceImpl implements GreetingService {

    private String GREETING = "Hello....?";

    @Override
    public String sayHello() {
        return GREETING;
    }
}
