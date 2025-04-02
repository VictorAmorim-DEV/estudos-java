package curso_java;

import java.util.Scanner;

public class exercicio_07_estrutura_repetitiva_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = Math.abs(sc.nextInt());
		
		for (int i = 1; i<=N; i++) {
			int numeroLinha = i;
			int quadrado = (int)Math.pow(i, 2.0);
			int cubo = (int)Math.pow(i, 3.0);
			System.out.println(numeroLinha + " " + quadrado + " " + cubo);
		}
		
		sc.close();

	}

}
