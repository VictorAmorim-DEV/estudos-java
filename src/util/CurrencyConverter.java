package util;

public class CurrencyConverter {
	
	public static double priceDol (double priceDolar, double request) {
		double total = priceDolar * request;
		return total + (total*0.06);
	}
	

}
