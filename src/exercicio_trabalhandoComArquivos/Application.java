package exercicio_trabalhandoComArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Product> list = new ArrayList<>();
		boolean certo = true;
		while(certo) {
			System.out.print("Enter file path:");
			//String designSourceFile = sc.nextLine();
			String designSourceFile = sc.nextLine();
			if (designSourceFile == "exit") {
				certo = false;
			}
			
			File sourceFile = new File(designSourceFile);
			String sourceFolder = sourceFile.getParent();
			
			
			boolean sucess = new File(sourceFolder + "/out").mkdir();
			String targetFile = sourceFolder + "/out/summary.csv";
			
			try (BufferedReader br = new BufferedReader(new FileReader(designSourceFile))) {
				String line = br.readLine();
				while (line != null) {
					String[] fields = line.split(",");
					String name = fields[0];
					double price = Double.parseDouble(fields[1]);
					int quantity = Integer.parseInt(fields[2]);
					list.add(new Product(name, price, quantity));
					line = br.readLine();
				}
			
			
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFile))) {
					for (Product item : list) {
						bw.write(item.getName() + ", " +  item.getPrice());
						bw.newLine();
					}
					certo = false;
					
					System.out.println(targetFile + " CREATED!");
				}
				catch (IOException e) {
					System.out.println("Error: " + e.getMessage());
				}
				
			}
			catch (IOException e) {
				
				System.out.println("Error: " + e.getMessage());
			}				
		}
		
		
		sc.close();

	}

}
