package exercicio_map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> votes = new LinkedHashMap<>();

			System.out.print("Enter file path:");
			String designSourceFile = sc.nextLine();		
			
			try (BufferedReader br = new BufferedReader(new FileReader(designSourceFile))) {
				String line = br.readLine();
				while (line != null) {
					String[] fields = line.split(",");
					String name = fields[0];
					Integer vote = Integer.parseInt(fields[1]);
					if (votes.containsKey(name)) {
						int addsVotes = votes.get(name);
						votes.put(name, vote + addsVotes);
					}
					else {
						votes.put(name, vote);
					}
					line = br.readLine();
				}
					for (String key : votes.keySet()) {
						System.out.println(key + ": " + votes.get(key));
					}						
			}
			catch (IOException e) {				
				System.out.println("Error: " + e.getMessage());
			}				
		
		sc.close();

	}

}
