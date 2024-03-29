package se.jpdc.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("ge")
public class PrimaryGermanGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "primärer Begrüßungsdienst";
    }
}
