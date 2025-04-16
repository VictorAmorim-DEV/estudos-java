package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicio11_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitados? ");
		int N = sc.nextInt();
		
		double[] altura = new double[N];
		char[] genero = new char[N];
		
		for (int i=0; i<N; i++) {
			System.out.print("Altura da " + (i+1) + "º pessoa:");
			altura[i] = sc.nextDouble();
			System.out.print("Gênero da " + (i+1) + "º pessoa:");
			genero[i] = sc.next().charAt(0);
		}
		
		double maiorAltura = 0;
		double menorAltura = 0;
		for (int i=0; i<N; i++) {
			if (altura [i] > maiorAltura) {
				maiorAltura = altura[i];
				menorAltura = maiorAltura;
			}
		}
		for (int i=0; i<N; i++) {	
			if (altura [i] < menorAltura) {
				menorAltura = altura [i];
			}
		
		}
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		
		double totalAlturaMulher = 0;
		int totalMulher = 0;
		int totalHomem = 0;
		for (int i=0; i<N; i++) {
			if (genero[i] == 'F') {
				totalAlturaMulher += altura[i]; 
				totalMulher += 1;
			}
			else if (genero[i] == 'M') {
				totalHomem += 1;
			}
		}
		double mediaAlturaMulher = totalAlturaMulher/totalMulher;
		System.out.printf("Média das alturas das mulheres = %.2f%n", mediaAlturaMulher);
		System.out.println("Número de homens = " + totalHomem);
		
		sc.close();

	}

}
