package program;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Locale.setDefault(Locale.US);
        
	    Rectangle rectangle = new Rectangle();

	    rectangle.heigth = sc.nextDouble();
	    rectangle.width  = sc.nextDouble();
	    
	    System.out.println(rectangle.area());
	    System.out.println(rectangle.diagonal());
	    System.out.println(rectangle.perimetro());
	}

}
