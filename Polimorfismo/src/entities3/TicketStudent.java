package entities3;

public class TicketStudent extends Ticket {
	private String institution;
	
	public TicketStudent() {
		
	}
	
	public TicketStudent(String eventName, Double basePrice,String institution ) {
		super(eventName, basePrice);
		this.institution = institution;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}
	
//	@Override
//	public void setBasePrice(Double basePrice) {
//		this.basePrice = basePrice / 2;
//	}
	
	public Double totalPrice() {
		return basePrice / 2;
	}
	
	@Override
	public String recibo() {
		return
		getEventName() + ": R$ " + totalPrice() + " (Estudante - " + getInstitution() + ")";
	}

	
}
