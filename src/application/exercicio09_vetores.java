package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicio09_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int N = sc.nextInt();
		String[] name = new String[N];
		int[] idade = new int[N];
		
		for (int i=0; i<N; i++) {
			System.out.println("Dados da " + (i+1) + "º pessoa:");
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		String pessoaMaisVelha = "";
		int maiorIdade = 0;
		for (int i=0; i<N; i++) {
			if (idade[i] > maiorIdade) {
				maiorIdade = idade[i];
				pessoaMaisVelha = name[i];
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);
		
		sc.close();

	}

}
