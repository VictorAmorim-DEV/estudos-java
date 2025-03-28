package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_estruturas_condicionais_08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor do salário: ");
		double salario = sc.nextDouble();
		double imposto;
		
		if (salario > 0.00 && salario <=2000.00) {
			System.out.println("Isento de imposto!");
		}
		else if (salario > 2000.00 && salario <=3000.00) {
			imposto = (salario-2000.00)*0.08;
			System.out.printf("Imposto = R$ %.2f", imposto);
		}
		else if (salario > 3000.00 && salario <=4500.00) {
			imposto = (1000.00*0.08) + ((salario-3000.00)*0.18);
			System.out.printf("Imposto = R$ %.2f", imposto);
		}
		else if (salario > 4500.00) {
			imposto = (1000.00*0.08) + (1500.00*0.18) + ((salario - 4500.00)*0.28);
			System.out.printf("Imposto = R$ %.2f", imposto);
		}
		
		sc.close();


	}

}
