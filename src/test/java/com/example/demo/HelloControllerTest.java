package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HelloControllerTest {
    
    @Test
    public void testSayHello() {
        HelloController controller = new HelloController();
        String response = controller.sayHello();
        assertEquals("Hola, mundo!", response);
    }
}
