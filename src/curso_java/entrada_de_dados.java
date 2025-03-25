package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char l;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		l = sc.next().charAt(0);
		
		System.out.println("Você digitou o nome: " + x);
		System.out.println("Digitou o numero INT: " + y);
		System.out.println("Você digitou o numero DOUBLE: " + z);
		System.out.printf("Você digitou o numero DOUBLE com \"printf\": %.2f%n", z);
		System.out.println("A primeira letra do nome é: " + l);
		System.out.printf("Tudo em uma linha: %s; %d; %.2f; %s%n", x, y, z, l);
		sc.close();

	}

}
