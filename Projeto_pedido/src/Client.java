import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	String name;
	String email;
	Date birthDate;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return name + " ("+sdf.format(birthDate)+") "+"- "+email;
	}  
}
