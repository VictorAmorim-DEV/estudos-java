package curso_java;

import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int total = n1+n2;
		
		System.out.println("SOMA = " + total);
		
		
		sc.close();

	}

}
