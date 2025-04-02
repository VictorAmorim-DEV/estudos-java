package curso_java;

import java.util.Scanner;

public class exercicio_05_estrutura_repetitiva_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int fatorial = 1;
		
		if (N==0) {
			System.out.println(fatorial);
		}
		else {
			for (int i = N; i>0; i--) {
				fatorial *= i;
			}
		System.out.println(fatorial);
		}
		
		sc.close();
		

	}

}
