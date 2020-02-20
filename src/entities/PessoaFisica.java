package entities;

public class PessoaFisica extends entidade {

	public Double saude;

	public PessoaFisica() {
	}
	
	public PessoaFisica(String name, Double income, Double saude) {
		super(name, income);
		this.saude = saude;
	}
	
	public Double getSaude() {
		return saude;
	}

	public void setSaude(Double saude) {
		this.saude = saude;
	}

	@Override
	public Double calcTax() {
		if (getIncome() <20000) {
			return (getIncome()*0.15)-(saude*0.5);
		}
		else {
			return (getIncome()*0.25)-(saude*0.5);
		}
	}
	
}
