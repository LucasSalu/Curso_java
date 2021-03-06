import java.util.Locale;
import java.util.Scanner;

import entities.Count;

public class Programmin {
	public static void main(String[] args) {
	    
		Locale.setDefault(Locale.US);
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter account number: ");
	    int number = sc.nextInt();
	    
	    System.out.println("Enter account holder: ");
	    String name = sc.nextLine();
	    name = sc.nextLine();
	    
	    System.out.println("Is there na initial deposit (y/n)?");
	    char resposta = sc.next().charAt(0);
        Count count = new Count();
	    if (resposta == 'y') {
	    	
	    	System.out.println("Enter initial deposit value:");
	    	double deposito = sc.nextDouble();
	    	count = new Count(number, name, deposito);
	    }
	    else {
	    	
	    	count = new Count(number, name);
	    }
	    System.out.println("Account Data:\n"+count+"\n");
	    System.out.println("Enter a deposit value: ");
	    double deposito = sc.nextDouble();
	    count.deposito(deposito);
	    
	    System.out.println("Updated account data:");
	    System.out.println(count);
	    
	    System.out.println("Enter a withdraw value:");
	    deposito = sc.nextDouble();
	    count.saque(deposito);
	    System.out.println("Account Data:\n"+count+"\n");
	    
	    
	    
	    
	} 
}
