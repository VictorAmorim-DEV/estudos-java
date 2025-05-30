package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.EmployeeForList;

public class exercicio_lista {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeForList> list = new ArrayList<>();
		System.out.print("How many employees will be registered?" );
		int n = sc.nextInt();
		
		for (int i=0; i<=n; i++) {
			System.out.println();
			System.out.println("Emplyoee #" + (i+1));			
			System.out.print("Id: ");
			int id = sc.nextInt();			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new EmployeeForList(id, name, salary));			
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		
		EmployeeForList result = list.stream().filter(x -> x.getId() ==id).findFirst().orElse(null);
		
		if (result == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			result.increaseSalary(percentage);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (EmployeeForList obj : list) {
			System.out.println(obj);
		}
		
		sc.close();

	}

}
