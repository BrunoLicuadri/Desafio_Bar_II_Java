package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Bill bill = new Bill();
		
		System.out.println("Sexo: ");
		bill.gender = sc.next().charAt(0);
		
		System.out.println("Quantidade de Cerveja: ");
		bill.beer = sc.nextInt();
		
		System.out.println("Quantidade de Refrigerantes: ");
		bill.softDrink = sc.nextInt();
		
		System.out.println("Quantidade de Espetinhos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println();
		
		System.out.println("Relatório: ");
		System.out.printf("Consumo: %.2f%n", bill.feeding());
		System.out.printf("Couvert: %.2f%n", bill.couvert());
		System.out.printf("Ingresso: %.2f%n", bill.ticket());
		System.out.println();
		System.out.printf("Valor a Pagar: %.2f%n", bill.total());
		
		sc.close();



	}

}
