package exercicio_set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set <Registration> set = new HashSet<>();	
		
		System.out.print("How many students for course A?");
		int quantity = sc.nextInt();
		
		for (int i = 0; i < quantity; i++) {
			Integer code = sc.nextInt();
			set.add(new Registration(code));
		}
		
		System.out.print("How many students for course B?");
		quantity = sc.nextInt();
		
		for (int i = 0; i < quantity; i++) {
			Integer code = sc.nextInt();
			set.add(new Registration(code));
		}
		
		System.out.print("How many students for course C?");
		quantity = sc.nextInt();
		
		for (int i = 0; i < quantity; i++) {
			Integer code = sc.nextInt();
			set.add(new Registration(code));
		}
		
		
		System.out.print("Total students: " + set.size());
		
		sc.close();

	}

}
