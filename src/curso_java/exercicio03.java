package curso_java;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int diferenca = A*B-C*D;
		
		System.out.println("Diferença = " + diferenca);
		
		sc.close();

	}

}
