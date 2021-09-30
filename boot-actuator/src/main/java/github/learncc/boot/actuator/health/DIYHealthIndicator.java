package github.learncc.boot.actuator.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class DIYHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        return Health.down().withDetail("details","known").build();
    }
}