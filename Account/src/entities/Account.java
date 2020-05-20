package entities;

public class Account {
	
	private Integer number;
	private String holer;
	protected Double balance;
	
	public Account() {
		super();
	}
	
	public Account(Integer number, String holer, Double balance) {
		this.number = number;
		this.holer = holer;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHoler() {
		return holer;
	}

	public void setHoler(String holer) {
		this.holer = holer;
	}

	public Double getBalance() {
		return balance;
	}

    public void withDraw(Double amount) {
    	balance -= amount + 5;
    }
    public void deposit(Double amount ) {
    	balance += amount ;
    }

	@Override
	public String toString() {
		return "Account [number=" + number + ", holer=" + holer + ", balance=" + balance + "]";
	}
	
	

}
