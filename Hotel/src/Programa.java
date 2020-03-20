import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno[] aluno = new Aluno[10];

		System.out.println("How many rooms will be rented?");
		int reservas = sc.nextInt();

        
		for (int i = 0; i < reservas; i++) {
			System.out.printf("Rent #%d:\n",i+1);
			
			System.out.print("Name: ");
	        sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Room: ");
			int quarto = sc.nextInt();

			aluno[quarto] =new  Aluno(name,email,quarto);
		}
		
		for(int i = 0; i < aluno.length; i++) {
			if(aluno[i]!= null) {
				System.out.printf("%d: %s, %s\n", aluno[i].getQuarto(), aluno[i].getName(),aluno[i].getEmail());
				
			}
		}
		
	}

}
