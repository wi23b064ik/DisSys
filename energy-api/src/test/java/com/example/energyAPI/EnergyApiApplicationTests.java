package com.example.energyAPI;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
class EnergyApiApplicationTests {

	@Test
	void contextLoads() {
	}

    @RestController
    public class TestController {
        @GetMapping("/hello")
        public String hello() {
            return "Hello from API!";
        }
    }

}
