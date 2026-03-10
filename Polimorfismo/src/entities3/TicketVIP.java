package entities3;

public class TicketVIP extends Ticket{
	private Double addValue;
	
	public TicketVIP() {
		
	}
	
	public TicketVIP(String eventName, Double basePrice, Double addValue) {
		super(eventName, basePrice);
		this.addValue = addValue;
	}
	
	public Double getAddValue() {
		return addValue;
	}
	
	public void setAddValue(Double addValue) {
		this.addValue = addValue;
	}
	
	public Double totalPrice() {
		return basePrice + addValue;
	}
	
	@Override
	public String recibo() {
		return
		getEventName() + ": R$" + totalPrice() + " (Inclui taxa VIP de R$" + getAddValue() + ")";
	}
}
