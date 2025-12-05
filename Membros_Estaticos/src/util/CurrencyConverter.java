package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double Pay(double value, double comprar) {
		return value * comprar * (1 + IOF);
	}
}
