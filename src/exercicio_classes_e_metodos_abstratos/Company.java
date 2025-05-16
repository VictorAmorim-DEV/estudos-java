package exercicio_classes_e_metodos_abstratos;

public class Company extends Taxpayer{

	private Integer numberOfEmployees;
	
	public Company() {
		super();
	}		
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double taxesPaid() {
		double tax;
		if (getNumberOfEmployees() > 10) {
			tax = super.getAnualIncome() * 0.14;
		}
		else {
			tax = super.getAnualIncome() * 0.16;
		}
		return tax;
	}

}
