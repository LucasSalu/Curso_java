package entities;

public class Count {
	
	private int number;
	private String name;
	private double balance;
	
	
 
	
	public Count(int number, String name, double balance) {
		this.number = number;
		this.name = name;
		this.balance = balance;
	}
        
	public Count(int number, String name) {
		this.number = number;
		this.name = name;	
	}
	
	public Count() {
		
	}
	
	public void setNumber(String name) {
		this.name = name;	
	}
	
	public int getNumber() {
		return number;
		
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposito(double deposito) {
		balance += deposito;
		
	}
	public void saque(double saque) {
		balance -= (saque+5);
		
	}
	public String toString() {
		return "Account, "
	            +number
	            +", Holder: "
	            +name
	            +"Balance: $ "
	            +balance;
	}
}
    