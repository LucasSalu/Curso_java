
public class pessoaFisica extends Pessoa {
	
	double gastosSaude;
	
	public pessoaFisica() {
	}

	public pessoaFisica(String nome, double renda, double gastosSaude) {
		super(nome, renda);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}
	
    private double verificaImpostos() {
        if (renda < 20000 ) {
        	return renda * 0.15;
        }else {
        	return renda * 0.25;
        }
    }
    
    private double verificaGastoSaude() {
    	return gastosSaude * 0.5;
    }
    
	@Override
	public double imposto() {
		return verificaImpostos() - verificaGastoSaude(); 
	}
	
	

}
