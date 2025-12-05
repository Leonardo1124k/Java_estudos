package entities;

public class Student {
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	
	public double gradesSum() {
		double finalGrade = grade1 + grade2 + grade3;
		return finalGrade;
	}
	
	public double approval() {
		if (gradesSum() >= 60.00) {
			return 0;
		}else {
			return 60.00 - gradesSum();
		}
	}
	
}
