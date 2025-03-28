package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_estruturas_condicionais_07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite as cordenadas x,y: ");
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x>0 && y>0) {
			System.out.println("Quadrante Q1");
		}
		else if (x>0 && y<0) {
			System.out.println("Quadrante Q4");
		}
		else if (x<0 && y>0) {
			System.out.println("Quadrante Q2");
		}
		else if (x<0 && y<0) {
			System.out.println("Quadrante Q3");
		}
		else if (x==0 && y==0) {
			System.out.println("Origem");
		}
		else if (x==0 && y!=0) {
			System.out.println("Eixo X");
		}
		else if (y==0 && x!=0) {
			System.out.println("Eixo Y");
		}
		
		sc.close();

	}

}
