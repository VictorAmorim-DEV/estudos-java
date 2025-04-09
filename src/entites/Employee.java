package entites;

public class Employee {
	
	public String Name;
	
	public double grossSalary;
	
	public double Tax; 
	
	public double percentage;
	
	
	public double netSalary() {
		double salary = grossSalary - Tax;
		return salary;
	}
	
	public void increaseSalary (double percentage) {
	percentage /= 100;
	grossSalary += (grossSalary*percentage);
	}
	
	public String toString() {
		return Name + ", $ " + String.format("%.2f", netSalary());
	}
	
	
	
	

}
