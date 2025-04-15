package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		for (int i=0; i<N; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double maiorValor = 0;
		int posicao = 0;
		for (int i=0; i<N; i++) {
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posicao = i;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = " + maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);	
		
		sc.close();

	}

}
