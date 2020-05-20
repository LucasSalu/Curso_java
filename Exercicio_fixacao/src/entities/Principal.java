package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner num = new Scanner(System.in);
		Scanner word = new Scanner(System.in);
		
		List<Product> listProducts =  new ArrayList();;

		System.out.println("Enter the number of products: ");
		int numeroDeProdutos = num.nextInt();
		String name;
		Double price;
		Double customsFee;

		for (int i = 1; i <= numeroDeProdutos; i++) {
			System.out.println("Common, used or imported (c/u/i)? ");
			char typeProduct = word.nextLine().charAt(0);
			switch (typeProduct) {
			case 'c' :
				
				System.out.println("Name");
				name = word.nextLine();
				
				System.out.println("Price");
				price = num.nextDouble();
				listProducts.add(new Product(name, price));
				break;
				
			case 'u':
				System.out.println("Name");
				name = word.nextLine();
				
				System.out.println("Price");
				price = num.nextDouble();
				listProducts.add(new usedProduct(name,price));
				break;
				
				
			case 'i':
				System.out.println("Name");
				name = word.nextLine();
				
				System.out.println("Price");
				price = num.nextDouble();
				
				System.out.println("Customs fee: ");
				customsFee = num.nextDouble();
				listProducts.add(new ImportedProduct(name, price, customsFee));				
				break;
				
			}
			

		}
		System.out.println("PRICE TAGS");
		for (Product prod: listProducts) {
			System.out.println(String.format("%s\n",prod.priceTag()));
		}


	}

}
