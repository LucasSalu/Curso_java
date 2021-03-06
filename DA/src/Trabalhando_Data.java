import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Trabalhando_Data {
	
	public static void main (String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(x3);
		
		
		Date y1 = sdf1.parse("21/03/2020");
		Date y2 = sdf2.parse("21/03/2020 04:10:50");
		System.out.println(y1);
		System.out.println(sdf2.format(y2));
		Date a = new Date();
		System.out.println(sdf2.format(a));
		
		
		
		sc.close();
	}

}
