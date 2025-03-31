package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class expressao_condicional_ternaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//double preco = sc.nextDouble;
		//double desconto;
		//if (preco < 20.0) {
		//desconto = preco * 0.1;
		//}
		//else {
		//desconto = preco * 0.05;
		//}
		//Utilizando a expressão condicional ternaria para resumir e simplificar esse código, podemos fazer assim:
		double preco = sc.nextDouble();
		double desconto = (preco < 20.0) ? (preco * 0.1) : (preco * 0.5);
		
		System.out.printf("O desconto é de: %.2f reais%n", desconto);
		
		sc.close();
	}

}
