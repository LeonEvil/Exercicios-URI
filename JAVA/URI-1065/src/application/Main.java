package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantity = 0;
		
		for (int i = 0; i < 5; i++) {
			if (sc.nextInt() % 2 == 0) {
				quantity++;
			}
		}
		
		System.out.println(quantity + " valores pares");
		
		sc.close();
	}
}