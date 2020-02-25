package com.logentries.orchestrator_test_java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {
    private HelloWorld helloWorld = new HelloWorld();

    @Test
    public void testGreetings(){
        assertEquals("Hello World!", helloWorld.greetings());
    }
}
