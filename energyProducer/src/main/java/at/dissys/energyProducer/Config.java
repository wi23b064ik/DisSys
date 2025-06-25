package at.dissys.energyProducer;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//This tells Spring Boot to use a queue named "energy".

@Configuration
public class Config {
    @Bean
    public Queue queue() {
        return new Queue("energy", false);
    }
}
