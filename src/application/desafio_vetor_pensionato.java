package application;

import java.util.Scanner;

import entites.Estudantes;

public class desafio_vetor_pensionato {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);	
		
		Estudantes[] estudantes = new Estudantes[10];
		
		System.out.print("Quantos estudantes irão alugar o quarto? ");	
		int N = sc.nextInt();			
		
		for (int i=1; i<=N; i++)/*pode também colocar i=0; i<N*/ {
			System.out.println();
			System.out.println("Aluguel #" + (i+1) + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Quarto: ");
			int quartoEscolhido = sc.nextInt();
			estudantes[quartoEscolhido] = new Estudantes(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos alugados:");
		for (int i=0; i<estudantes.length; i++) {
			if (estudantes[i] != null)
			System.out.println(i+ ": " + estudantes[i]);
		}
		
		
		sc.close();

	}

}
