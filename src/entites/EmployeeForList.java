package entites;

public class EmployeeForList {
	private Integer id;
	private String name;
	private Double salary;
	
	public EmployeeForList() {
	}
	
	public EmployeeForList(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		salary += (salary * (percentage/100));
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	}
	
	
	

}
