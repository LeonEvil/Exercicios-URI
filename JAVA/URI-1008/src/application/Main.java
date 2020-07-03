package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int hours = sc.nextInt();
		double value = sc.nextDouble();
		
		System.out.println("NUMBER = " + number);
		System.out.println("SALARY = U$ " + String.format("%.2f", hours * value));
		
		sc.close();
	}
}