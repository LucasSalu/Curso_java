import java.util.Locale;
import java.util.Scanner;

import entitis.CorrencyConverte;

public class programmin {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		CorrencyConverte.dolar = sc.nextDouble();
		CorrencyConverte.buy = sc.nextDouble();
		
		System.out.println(CorrencyConverte.converteBuy());
	}

}
