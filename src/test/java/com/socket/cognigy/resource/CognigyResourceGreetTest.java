package com.socket.cognigy.resource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CognigyResourceGreetTest {

    @Autowired
    private CognigyResource cognigyResource;

    @Test
    void greet() {
        assertEquals("Hello Nihal!!", cognigyResource.greet("Nihal"));
    }
}