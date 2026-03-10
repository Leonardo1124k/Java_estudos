package entities2;

public class TaxPF extends Tax {
	private Double healthMoney;
	
	public TaxPF() {
		super();
	}
	
	public TaxPF(String name, Double annualIncome, Double healthMoney){
		super(name,annualIncome);
		this.healthMoney = healthMoney;
	}
	
	public Double getHealthMoney() {
		return healthMoney;
	}

	public void setHealthMoney(Double healthMoney) {
		this.healthMoney = healthMoney;
	}
	
	public Double totalPayment() {
		double totalPayment;
		if(annualIncome < 20000) {
			totalPayment = annualIncome * 15/100;
		}
		else{
			totalPayment = annualIncome * 25/100;
		}
		
		if(healthMoney > 0) {
			totalPayment -= healthMoney * 1/2;
		}
		return totalPayment;
	}
	
	@Override
	public String paymentString() {

		return name + ": R$" + totalPayment();
	}
}
