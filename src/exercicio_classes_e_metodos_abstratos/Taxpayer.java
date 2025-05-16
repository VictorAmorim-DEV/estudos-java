package exercicio_classes_e_metodos_abstratos;

public abstract class Taxpayer {
	private String name;
	private Double anualIncome;
	
	public Taxpayer() {
	}
	
	public Taxpayer(String name, Double anualIncome) {
		this.name = name;
		this.anualIncome = anualIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnualIncome() {
		return anualIncome;
	}

	public void setAnualIncome(Double anualIncome) {
		this.anualIncome = anualIncome;
	}
	
	public abstract double taxesPaid();
	

}
