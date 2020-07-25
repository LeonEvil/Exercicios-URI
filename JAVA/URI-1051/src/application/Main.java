package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salary = sc.nextDouble();
		double value = 0.0;
		
		if (salary > 2000.0 && salary <= 3000.0) {
			value = (salary - 2000.00) * 0.08; 
		} else if (salary > 3000.0 && salary <= 4500.0) {
			value = (salary - 3000) * 0.18 + 1000 * 0.08; 
		} else if (salary > 4500.0) {
			value = (salary - 4500) * 0.28 + 1500 * 0.18 + 1000 * 0.08; 
		}
		
		System.out.println((salary >= 0.0 && salary <= 2000.0) ? "Isento" : "R$ " + String.format("%.2f", value));	
		sc.close();
	}
}