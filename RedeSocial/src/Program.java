import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Program {

	public static void main(String args[]) throws ParseException {
        Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date y2 = sdf.parse("21/03/2020 04:10:50");
		
		Post post1 = new Post(y2,"Traveling to New Zealand","I'm going to visit this wonderful country!",12);
		post1.addComment(new Comment("Have a nice trip"));
		post1.addComment(new Comment("Wow that's awesome!"));
		
		
		y2 = sdf.parse("28/07/2018 23:14:19");
		Post post2 = new Post(y2,"Good night guys","See you tomorrow",7);
		post2.addComment(new Comment("Good night"));
		post2.addComment(new Comment("May the Force be with you"));
		
		System.out.println(post1);
		System.out.println();
		System.out.println();
		System.out.println(post1);
		
	   
	}
}
