package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int N = sc.nextInt();
		String[] nome = new String[N];
		int[] idade = new int[N];
		double[] altura = new double[N];
		
		for (int i=0; i<N; i++) {
			System.out.println("Dados da " + (i+1) + "º pessoa:");
			System.out.print("Nome: ");
			nome[i] = sc.next();	
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
		}
		System.out.println();
		
		double soma = 0;
		for (int i=0; i<N; i++) {
			soma += altura[i];
		}
		double media = soma/N;
		System.out.printf("Altura média: %.2f%n", media);
		
		double cont = 0;
		for (int i=0; i<N; i++) {
			if (idade[i] < 16) {
				cont += 1;	
			}
		}
		double percent = cont*100 / N;
		System.out.printf("Pessoas com menos de 16 anos: %.2f%%%n", percent);
		
		for (int i=0; i<N; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);	
			}
		}
		
		sc.close();

	}

}
