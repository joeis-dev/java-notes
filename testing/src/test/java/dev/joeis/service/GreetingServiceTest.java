package dev.joeis.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingServiceTest {
    private GreetingService greetingService = new GreetingService();

    @Test
    @DisplayName("It must return 'Hello World' for the string 'World'")
    void shouldReturnHelloWorld() {
        String result = greetingService.greet("World");
        assertEquals("Hello World", result);
    }

    @Test
    @DisplayName("It must return 'Hello Guest' for the null value provided")
    void shouldReturnHelloGuestForNullValue() {
        String result = greetingService.greet(null);
        assertEquals("Hello Guest", result);
    }

    @Test
    @DisplayName("It must return 'Que rollo plebes' for the salutation 'Que rollo' and the name 'plebes'")
    void shouldReturnQueRolloPlebes() {
        String result = greetingService.greetWithSalutation("plebes", "Que rollo");
        assertEquals("Que rollo plebes", result);
    }

    @Test
    @DisplayName("It must return 'Hello World' for the salutation being null")
    void shouldReturnHelloWorldWhenThereIsNoSalutation() {
        String result = greetingService.greetWithSalutation("plebes", null);
        assertEquals("Hello plebes", result);
    }
}
