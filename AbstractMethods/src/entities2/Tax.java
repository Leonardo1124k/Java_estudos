package entities2;

public abstract class Tax {
	protected String name;
	protected Double annualIncome;
	
	public Tax() {
	}
	
	public Tax(String name, Double annualIncome) {
		this.name = name;
		this.annualIncome = annualIncome;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public Double getAnnualIncome() {
		return annualIncome;
	}
	
	public void setAnnualIncome(Double annualIncome){
		this.annualIncome = annualIncome;
	}
	
	public abstract String paymentString();
	public abstract Double totalPayment();
}
