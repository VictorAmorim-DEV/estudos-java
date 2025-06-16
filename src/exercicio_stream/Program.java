package exercicio_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter file path:");
		String file = sc.nextLine();		
			
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);
				list.add(new Employee(name, email, salary));
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double salaryLimit = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(s -> s.getSalary() > salaryLimit)
					.map(s -> s.getEmail())
					.sorted()
					.collect(Collectors.toList());
			
			System.out.printf("Email of people whose salary is more than %.2f%n", salaryLimit);
			
			for (String e: emails) {
				System.out.println(e);
			}
			
			Double sum = list.stream()
					.filter(s -> s.getName().charAt(0) == 'M')
					.map(s -> s.getSalary())
					.reduce(0.0, (x,y) -> x + y);
			System.out.printf("Sum of salary of people whose name starts with 'M': %.2f%n", sum);
			
		}
		catch (IOException e) {				
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
