package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.enums.WorkerLevel;

public class Programming {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner letra = new Scanner(System.in);
		Scanner num = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter department's name: ");
		Department department = new Department(letra.nextLine());
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String name = letra.nextLine();
		
		System.out.print("Level: ");
		String workLevel =  letra.nextLine();
		
		System.out.print("Base salary: ");
		double baseSalary = num.nextDouble();
		
		Worker worker = new Worker(name,WorkerLevel.valueOf(workLevel), baseSalary,department);
		System.out.print("How many contracts to this worker? ");
		int quantidade = num.nextInt();
		
		for(int i = 0; i< quantidade; i++) {
			System.out.printf("Enter contract #%d data:",i+1);
			System.out.println("Date (DD/MM/YYYY):");
			Date date = sdf1.parse(letra.nextLine());
			System.out.println("Value per hour: ");
			double valuePerHour = num.nextDouble();
			System.out.println("Duration (hours): ");
			int hours = num.nextInt();
			
			HourContract hourContract = new HourContract(date,valuePerHour,hours);
			worker.addContract(hourContract);
			
					
		}
		System.out.println("Enter month and year to calculate income (MM/YYYY):");
		String monthAndYear = letra.nextLine();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println(worker.income(year,month));
;
		
        letra.close();
        num.close();
	}

}
