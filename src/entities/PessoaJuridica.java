package entities;

public class PessoaJuridica extends entidade{
	
	public Integer func;
	
	public PessoaJuridica() {	
	}

	public PessoaJuridica(String name, Double income, Integer func) {
		super(name, income);
		this.func = func;
	}

	public Integer getFunc() {
		return func;
	}

	public void setFunc(Integer func) {
		this.func = func;
	}
	
	@Override
	public Double calcTax() {
		if (func<=10) {
			return (getIncome()*0.16);
		}
		else {
			return (getIncome()*0.14);
		}
	}
	

}
