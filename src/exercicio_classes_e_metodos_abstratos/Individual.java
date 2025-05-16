package exercicio_classes_e_metodos_abstratos;

public class Individual extends Taxpayer{

	private Double healthSpending;
	
	public Individual() {
		super();
	}	
	
	public Individual(String name, Double anualIncome, Double healthSpending) {
		super(name, anualIncome);
		this.healthSpending = healthSpending;
	}

	public Double getHealthSpending() {
		return healthSpending;
	}

	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}

	@Override
	public double taxesPaid() {
		double tax;
		if (super.getAnualIncome() < 20000.00) {
			tax = super.getAnualIncome() * 0.15;
		}
		else {
			tax = super.getAnualIncome() * 0.25;
		}
		if (getHealthSpending() != 0) {
			tax -= getHealthSpending()*0.50;
		}
		return tax;
	}

}
