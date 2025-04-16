package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicio08_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantos elementos terá o vetor? ");
		int N = sc.nextInt();
		int[] vect = new int[N];
		
		for (int i=0; i<N; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		int totalPar = 0;
		int quantPar = 0;
		for (int i=0; i<N; i++) {
			if (vect[i] % 2 ==0) {
				totalPar +=vect[i];
				quantPar += 1;
			}
		}
		
		if (quantPar > 0) {
			double media = totalPar/quantPar;
			System.out.printf("MÉDIA DOS PARES = %.1f%n", media);
		}
		else {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		
		sc.close();

	}

}
