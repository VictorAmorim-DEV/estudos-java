package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int c1 = sc.nextInt();
		int n1 = sc.nextInt();
		double vu1 = sc.nextDouble();
		
		int c2 = sc.nextInt();
		int n2 = sc.nextInt();
		double vu2 = sc.nextDouble();
		
		double valor = n1*vu1 + n2*vu2;
		
		System.out.printf("VALOR A PAGAR = R$ %.2f%n", valor);
		
		sc.close();

	}

}
