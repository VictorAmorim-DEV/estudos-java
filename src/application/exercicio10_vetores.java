package application;

import java.util.Locale;
import java.util.Scanner;

public class exercicio10_vetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Quantas alunos serão digitados? ");
		int N = sc.nextInt();
		
		String[] name = new String[N];
		double[] nota1 = new double[N];
		double[] nota2 = new double[N];
		
		for (int i=0; i<N; i++) {
			System.out.println("Digite o nome, primeira e segunda nota do " + (i+1) + "º aluno");
			sc.nextLine();
			name[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println("Alunos aprovados:");
		double media = 0;
		for (int i=0; i<N; i++) {
			media = (nota1[i] + nota2[i])/2;
			if (media>=6) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();

	}

}
