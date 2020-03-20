package entities;

public class Aluno {
	
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double calculaNota() {
		return (nota1+nota2+nota3);
	}
	
	public String situacao() {
		
		if (calculaNota()>60) {
			return "FINAL GRADE "+String.format("%.2f",calculaNota())+"\n"+"PASS";
		}
		else {
			return "FINAL GRADE "+String.format("%.2f",calculaNota())+"\nFAILED"+"\nMISSING "+String.format("%.2f",(60-calculaNota()))+"POINTS";
			
		}
		
	}

}
