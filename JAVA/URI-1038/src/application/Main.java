package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code = sc.nextInt();
		int quantity = sc.nextInt();
		double total = 0;
		
		switch (code) {
		
		case 1:
			total = quantity * 4.0;
			break;
			
		case 2:
			total = quantity * 4.5;
			break;
			
		case 3:
			total = quantity * 5.0;
			break;
			
		case 4:
			total = quantity * 2.0;
			break;
			
		case 5:
			total = quantity * 1.5;
			break;

		default:
			break;
		}
		
		System.out.println("Total: R$ " + String.format("%.2f", total));
		
		sc.close();
	}
}