package application;

import java.util.Locale;
import java.util.Scanner;

import entites.Rectangle;

public class programa_exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle x;
		x = new Rectangle();
		
		System.out.println("Enter rectangle width and height: ");
		
		x.Width = sc.nextDouble();
		x.Height = sc.nextDouble();
		
		double area = x.area();
		double perimeter = x.perimeter();
		double diagonal = x.diagonal();
		
		System.out.printf("AREA = %.2f%n", area);
		
		System.out.printf("PERIMETER = %.2f%n", perimeter);
		
		System.out.printf("DIAGONAL = %.2f%n", diagonal);
		
		
		
		sc.close();

	}

}
