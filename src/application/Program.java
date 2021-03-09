package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		Rent[] vect = new Rent[10];
		
		System.out.println("How many rooms will be rented? ");
		int quantity = sc.nextInt();
		
		for (int i = 0; i<quantity; i++) {
			System.out.printf("Rent #%d%n", i+1);
			sc.nextLine();
			System.out.printf("Name: ");
			String name = sc.nextLine();
			System.out.printf("Email: ");
			String email = sc.nextLine();
			System.out.printf("Room: ");
			int room = sc.nextInt();
			
			vect[room] = new Rent(name, email, room);
			
		}
		
		System.out.println();
		
		System.out.println("Busy rooms: ");
		
		for (int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i].toString());
			}
		}
		
		
		sc.close();

	}

}
