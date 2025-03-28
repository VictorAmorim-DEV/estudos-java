package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_estruturas_condicionais_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Leia a hora inicial do jogo: ");
		double hi = sc.nextDouble();
		
		System.out.print("Leia a hora final do jogo: ");
		double hf = sc.nextDouble();
		
		if (hi < hf) {
			double ht = (hf - hi);
			System.out.printf("O JOGO DUROU %.2f HORAS %n", ht);
		}
		else {
			double ht = 24.00-(hi - hf);
			System.out.printf("O JOGO DUROU %.2f HORAS %n", ht);
		}
		
		sc.close();


	}

}
