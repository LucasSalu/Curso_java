package entities;

public class Aluno {
	
	public String name;
	public String email;
    public int quarto;
    
	public Aluno(String name, String email, int quarto) {
		this.name = name;
		this.email = email;
		this.quarto = quarto;
	
	
	}

	public Aluno() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getQuarto() {
		return quarto;
	}

	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}

}
