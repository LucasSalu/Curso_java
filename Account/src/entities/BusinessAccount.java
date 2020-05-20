package entities;

public class BusinessAccount extends Account{
	protected Double loanLimit;
	
	public BusinessAccount() {	
	}
	
	public BusinessAccount(Integer number, String holer, Double balance, Double loanLimit) {
		super(number, holer, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void loanLimit(Double amount) {
		deposit(amount);
	}
    @Override
    public void withDraw(Double amount) {
    	super.withDraw(amount);
    	balance -= 2;
    }
    
	
}
