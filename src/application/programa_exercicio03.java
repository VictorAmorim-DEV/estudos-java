package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Student;

public class programa_exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student nota;
		nota = new Student();
		
		nota.name = sc.nextLine();
		nota.a = sc.nextDouble();
		nota.b = sc.nextDouble();
		nota.c = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", nota.finalGrade());
		
		if (nota.finalGrade() > 60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			System.out.print(nota.toString());
		}
		
		sc.close();
		
		

	}

}
