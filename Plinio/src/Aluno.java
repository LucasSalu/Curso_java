
public class Aluno {
	private String nome;
	private float p1;
	private float p2;
	
	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNotaP1(float p1) {
		this.p1 = p1;
	}


	public void setNotaP2(float p2) {
		this.p2 = p2;
	}
	public boolean isAprovado() {
		double media = (this.p1+this.p2)/2.0;
		if (media <6.0) {
			return false;
		}
		else {
			return true;
		}
	}

	public String toString() {
		if (this.isAprovado()) {
			return "O Aluno "+this.nome+ " foi aprovado";
		
		}else {
			return "O Aluno "+this.nome+ " reprovou...";
			
		}
		
	}
	
	

	
}
