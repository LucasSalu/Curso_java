package entitis;

public class CorrencyConverte {
	
	public static double dolar;
	public static double buy;
	
	public static String converteBuy() {
		return String.format("%.2f",((buy * dolar)* 1.06));
			
	}
	
	

}
