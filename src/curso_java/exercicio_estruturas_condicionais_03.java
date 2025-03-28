package curso_java;

import java.util.Scanner;

public class exercicio_estruturas_condicionais_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite dois numeros: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		if (n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("São Multiplos!");
		}
		else {
			System.out.println("Não são Multiplos!");
		}
		
		sc.close();

	}

}
