package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03_estrutura_repetitiva_for {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 0; i<N; i++) {
			double caso1 = sc.nextDouble();
			double caso2 = sc.nextDouble();
			double caso3 = sc.nextDouble();
			double mediaPonderada = ((caso1 * 2)+(caso2 * 3)+(caso3 * 5)) / (2+3+5);
			System.out.printf("%.1f%n", mediaPonderada);
		}
		
		sc.close();

	}

}
