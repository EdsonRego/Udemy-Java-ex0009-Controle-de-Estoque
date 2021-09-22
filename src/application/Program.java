package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Product product = new Product();
		System.out.println("Enter product data: ");

		System.out.print("Name: ");
		product.name = sc.nextLine();

		System.out.print("Price: ");
		product.price = sc.nextDouble();

		System.out.print("Stock quantity: ");
		product.quantity = sc.nextInt();

		System.out.println();
		System.out.println("Product data: " + product.toString());

		// adica��o de quantidades dentro do objeto product
		System.out.println();
		System.out.print("Enter the number of products to be added in stock:  ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product.toString());

		// remo��o de quantidades
		System.out.println();
		System.out.print("Enter the number of products to be removed in stock:  ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Updated data: " + product.toString());

		sc.close();

	}

}