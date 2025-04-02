package curso_java;

import java.util.Scanner;

public class exercicio_03_estrutura_repetitiva_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int al = 0;
		int ga = 0;
		int di = 0;
		
		while (codigo != 4) {
			switch (codigo) {
				case 1:
					al += 1;
					break;
				case 2:
					ga += 1;
					break;
				case 3:
					di += 1;
					break;
			}
			codigo = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + al);
		System.out.println("Gasolina: " + ga);
		System.out.println("Diesel: " + di);
		sc.close();

	}

}
