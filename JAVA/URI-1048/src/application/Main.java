package application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".00");
		
		double salary = sc.nextDouble();
		double x = 0.0;
		int porcentage = 0;
		
		if (salary >= 0 && salary <= 400.0) {
			x = salary * 15 / 100;
			porcentage = 15;
		} else if(salary > 400.0 && salary <= 800.0) {
			x = salary * 12 / 100;
			porcentage = 12;
		} else if (salary > 800.0 && salary <= 1200.0) {
			x = salary * 10 / 100;
			porcentage = 10;
		} else if (salary > 1200.0 && salary <= 2000.0) {
			x = salary * 7 / 100;
			porcentage = 7;
		} else {
			x = salary * 4 / 100;
			porcentage = 4;
		}
		
		System.out.println("Novo salario: " + df.format(salary + x));
		System.out.println("Reajuste ganho: " + df.format(x));
		System.out.println("Em percentual: " + porcentage + " %");
		
		sc.close();
	}
}