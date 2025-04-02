package curso_java;

import java.util.Scanner;

public class exercicio_01_estrutura_repetitiva_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		if (1 <= X && X <= 1000) {
			for (int n = 1; n <= X; n++) {
				if (n % 2 == 1) {
					System.out.println(n);
				}
			}
		}
		
		sc.close();

	}

}
