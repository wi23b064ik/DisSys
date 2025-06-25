package at.dissys.energyUser;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Queue queue() {
        return new Queue("energy", false);
    }
}
