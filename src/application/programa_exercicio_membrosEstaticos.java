package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class programa_exercicio_membrosEstaticos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("What is the dollar price? ");
		double priceDolar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double request = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f%n", CurrencyConverter.priceDol(priceDolar, request));
		
		sc.close();

	}

}
