package application;
import java.util.Locale;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
        double xA, xB, xC, yA, yB, yC;
        
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        
       double px = ((xA + xB + xC)/2); 
       double py = ((yA + yB + yC)/2);
       
       System.out.printf("%.4f%n", Math.sqrt((px*(px-xA)*(px-xB)*(px-xC))));
       System.out.printf("%.4f%n", Math.sqrt((py*(py-yA)*(py-yB)*(py-yC)))); 
        
		
	}
	
	

}
