package application;

import java.util.Scanner;

public class exercicio04_vetores {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int N = sc.nextInt();
		int[] vect = new int[N];
		
		for (int i=0; i<N; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println("NÚMEROS PARES:");
		int soma = 0;
		for (int i=0; i<N; i++) {
			if (vect[i] % 2 == 0) {
				System.out.printf("%s ",vect[i]);
				soma += 1;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + soma);
		
		sc.close();

	}

}
