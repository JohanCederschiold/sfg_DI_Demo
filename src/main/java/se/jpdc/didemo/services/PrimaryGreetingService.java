package se.jpdc.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "I come from a @Primary Bean";
    }
}
