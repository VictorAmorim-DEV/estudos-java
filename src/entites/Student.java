package entites;

public class Student {
	public String name;
	public double a;
	public double b;
	public double c;
	
	public double finalGrade() {
		double notaTotal = a+b+c;
		return notaTotal;
	}
	
	public double missingPoints() {
		double point = 60 - finalGrade();
		return point;
	}
	
	public String toString() {
		return "MISSING " + String.format("%.2f", missingPoints()) + " POINTS";
	}
}
