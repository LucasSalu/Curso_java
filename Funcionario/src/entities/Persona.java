package entities;

public class Persona {
	public String name;
	public double salary;
	public double tax;

	public double salaryBrute() {
        return salary - tax;
	}
	
    public void increaseSalary(double porcentagem){
    	salary += (salary*(porcentagem/100));
    	
    }
	
	
	public String toString() {
		return "Employee: " + this.name + ", $ "+String.format("%.2f",salaryBrute());
	}
	
}
