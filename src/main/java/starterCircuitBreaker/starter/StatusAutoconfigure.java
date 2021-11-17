package starterCircuitBreaker.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
@ConditionalOnClass(Status.class)
@EnableConfigurationProperties(StatusProperties.class)
public class StatusAutoconfigure {
	
private final StatusProperties properties;
	

	public StatusAutoconfigure(StatusProperties properties) {
		this.properties= properties;
	}
	
	@Bean
	public Status status() {

		return new Status(properties.getContador());
	}

}
