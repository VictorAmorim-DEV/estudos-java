package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_estruturas_condicionais_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("_______________________________________");
		System.out.println(" CODIGO    ESPECIFICAÇÕES      PREÇO ");
		System.out.println("_______________________________________");
		System.out.println(" 1         Cachorro quente     R$4.00  ");
		System.out.println(" 2         X-Salada            R$4.50  ");
		System.out.println(" 3         X-Bacon             R$5.00  ");
		System.out.println(" 4         Torrada simples     R$2.00  ");
		System.out.println(" 5         Refrigerante        R$1.50  ");	
		System.out.println("_______________________________________");
		System.out.println("");
		System.out.print("Digite o código do seu pedido e a quantidade: ");
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		if (codigo == 1) {
			double total = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f", total);
		}
		else if (codigo == 2) {
			double total = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f", total);
		}
		else if (codigo == 3) {
			double total = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f", total);
		}
		else if (codigo == 4) {
			double total = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f", total);
		}
		else if (codigo == 5) {
			double total = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f", total);
		}
		
		sc.close();

	}

}
