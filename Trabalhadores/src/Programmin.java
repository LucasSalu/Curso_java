import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;

import entities.Trabalhador;

public class Programmin {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Trabalhador> trabalhador = new ArrayList<>();
		System.out.println("How many employees will be registered?");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.printf("Emplyoee #%d:", i + 1);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			System.out.print("Name; ");
			String name = sc.nextLine();

			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();
			Trabalhador trabalho = new Trabalhador(id, name, salary);
			trabalhador.add(trabalho);

		}

		System.out.println("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		System.out.println("Enter the percentage:");
		int aux = 0;

		for (Trabalhador c : trabalhador) {
			if (c.getId() == id) {
				int x = sc.nextInt();
				c.ajustaSalario(x);
				break;
			}
			aux++;
			if (aux == num) {
				System.out.println("This id does not exist!\r\n");
				break;
			}
		}
		for (Trabalhador c : trabalhador){
			System.out.println(c.toString());
		}
		
	}

}
