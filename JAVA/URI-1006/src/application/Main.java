package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble() * 2;
		double B = sc.nextDouble() * 3;
		double C = sc.nextDouble() * 5;
		
		System.out.println("MEDIA = " + String.format("%.1f", (A + B + C) / 10));
		
		sc.close();
	}
}