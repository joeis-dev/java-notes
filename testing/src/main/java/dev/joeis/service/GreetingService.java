package dev.joeis.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String greet(String name) {
        if (name == null || name.trim().isEmpty())
            return "Hello Guest";
        return "Hello " + name;
    }

    public String greetWithSalutation(String name, String salutation) {
        if (salutation == null || salutation.trim().isEmpty())
            return greet(name);
        return salutation + " " + name;
    }
}
