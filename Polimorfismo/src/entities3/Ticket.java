package entities3;

public class Ticket {
	protected String eventName; // atributo
	protected Double basePrice; // atributo
	
	public Ticket() { //recurso de Sobrecarga -> construtor sem parâmetros
		
	}
	
	public Ticket(String eventName, Double basePrice) { //construtor com parâmetros
		this.eventName = eventName;
		this.basePrice = basePrice;
	}
	
	public String getEventName() { //recurso de Encapsulamento -> getter
		return eventName;
	}
	
	public void setEventName(String eventName) { // Encapsulamento -> setter
		this.eventName = eventName;
	}
	
	public Double getBasePrice() {
		return basePrice;
	}
	
	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
//		if (basePrice >= 0) {
//	        this.basePrice = basePrice;
//	    } else {
//	        // Garante que o objeto não fique com preço negativo "impossível"
//	        this.basePrice = 0.0; 
//	    }
	}
	
	public String recibo() {
		return
		eventName + ": R$ " + basePrice;
	}
	
}
