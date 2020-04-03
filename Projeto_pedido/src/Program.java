import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner letra = new Scanner(System.in);
		Scanner numeros = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

		System.out.print("Name: ");
		String name = letra.nextLine();

		System.out.print("Email: ");
		String email = letra.next();

		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = letra.next();

		Client client = new Client(name, email, sdf.parse(birthDate));

		System.out.println("Enter order data: ");
		String status = letra.next();

		Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

		System.out.println("How many items to this order? ");
		int vezes = numeros.nextInt();
		letra.nextLine();

		for (int c = 1; c <= vezes; c++) {
			System.out.printf("Enter #%d item data:\n", c);
			System.out.println("Product name: ");
			name = letra.nextLine();

			System.out.println("Product price: ");
			Double price = numeros.nextDouble();

			System.out.println("Quantity: ");
			int quantity = numeros.nextInt();

			order.addItem(new OrderItem(quantity, new Product(name, price)));
		}
        System.out.println(order);
	}
}
