package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantos elementos terá o vetor? ");
		int N = sc.nextInt();
		double[] vect = new double[N];
		
		for (int i=0; i<N; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		System.out.println();
		
		double total = 0;
		for (int i=0; i<N; i++) {
			total += vect[i];
		}
		double media = total/N;
		System.out.printf("MÉDIA DO VETOR = %.3f%n", media);
		
		System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
		for (int i=0; i<N; i++) {
			if (vect[i] < media) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();

	}

}
