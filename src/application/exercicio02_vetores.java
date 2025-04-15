package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar?: ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		for (int i=0; i < N; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
			
		System.out.println();
		System.out.print("VALORES = ");
		for (int i=0; i < N; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		System.out.println();
		
		double soma = 0;
		for (int i=0; i < N; i++) {
			soma += vect[i];
		}
		System.out.printf("SOMA = %.2f%n", soma);
		
		double media = (soma/N);
		System.out.printf("MÉDIA = %.2f%n", media);
		
		sc.close();

	}

}
