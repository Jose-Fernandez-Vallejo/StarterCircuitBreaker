package starterCircuitBreaker.starter;

public class Status {
	
	final String  open = "open";
	final String  close = "close";
	final String  halfopen = "half-open";

	Long maxContador;
	Long contador;
	String status;
	
	public Status(Long maxContador)
	{
		this.maxContador = maxContador;
		contador = 0L;
		this.status = "close";
	}
	
	
	public String executeCircuit(String newstatus)
	{
		
		if (contador>=maxContador) {
			status = open;
			return status;
		}
		
		if (newstatus.equals(close)) {
			status = close;
		}
		
		if (newstatus.equals(halfopen)) {
			status = open;
		}
		
		
		if (newstatus.equals(open)) {
			status = halfopen;
		}
		
		
		contador++;
		return status;
		
	}
	
	
}
