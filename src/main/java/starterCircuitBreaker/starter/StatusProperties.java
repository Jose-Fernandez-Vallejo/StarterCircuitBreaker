package starterCircuitBreaker.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("status.maxcontador")
public class StatusProperties {
	
private Long contador = 5L;
	
	public Long getContador() {
		return contador;
	}

	public void setContador(Long contador) {
		this.contador = contador;
	}

}
