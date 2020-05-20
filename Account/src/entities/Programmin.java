package entities;


public class Programmin {

	public static void main(String[] args) {
		
		 Account acc = new Account(1001, "Alex", 1000.0 );
		 acc.withDraw(200.00);
		 System.out.println(acc.getBalance());
		 
		 Account acc1 = new SavingsAccount(1002, "Jardel", 1000.00, 0.01);
		 acc1.withDraw(200.00);
		 System.out.println(acc1.getBalance());
		 
		 Account acc2 = new BusinessAccount(1003, "Carlos", 1000.00,200.00);
		 acc2.withDraw(100.00);
		 System.out.println(acc2.getBalance());

	}

}
