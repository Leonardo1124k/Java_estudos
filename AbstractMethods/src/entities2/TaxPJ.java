package entities2;

public class TaxPJ extends Tax{
	private Integer employeeNumber;
	
	public TaxPJ() {
		super();
	}
	
	public TaxPJ(String name, Double annualIncome, Integer employeeNumber){
		super(name, annualIncome);
		this.employeeNumber = employeeNumber;
	}
	
	public Integer getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(Integer employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	public Double totalPayment() {
		double totalPayment;
		if(employeeNumber >= 10) {
			totalPayment = annualIncome * 14/100;
		}
		else{
			totalPayment = annualIncome * 16/100;
		}
		return totalPayment;
	}
	
	@Override
	public String paymentString() {
		return name + ": R$" + totalPayment();
	}

}
