package entites;

public class Rectangle {
	
	public double Width;
	public double Height;
	
	public double area() {
		double Area = Width * Height;
		return Area;
	}	
	
	public double perimeter() {
		double p = 2*(Width + Height);
		return p;
	}
	
	public double diagonal() {
		double d = (Math.pow(Width, 2.00)) + (Math.pow(Height, 2.00));
		return Math.sqrt(d);
	}
	
		
	}
