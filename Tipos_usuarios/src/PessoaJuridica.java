
public class PessoaJuridica extends Pessoa {
	
	int numeroFuncionarios;
	

	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, double renda, int numeroFuncionarios) {
		super(nome, renda);
		this.numeroFuncionarios = numeroFuncionarios;
	}
	
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}

	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}

	@Override
	public double imposto() {
		if (numeroFuncionarios >= 10) {
			return (renda * 0.14);
			}
	    else {
			return (renda * 0.16);
			}	
		}
	
}
	
	
