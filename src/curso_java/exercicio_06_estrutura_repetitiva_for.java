package curso_java;

import java.util.Scanner;

public class exercicio_06_estrutura_repetitiva_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i<=N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
