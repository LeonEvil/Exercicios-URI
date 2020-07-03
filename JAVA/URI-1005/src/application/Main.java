package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble() * 3.5;
		double B = sc.nextDouble() * 7.5;
		
		System.out.println("MEDIA = " + String.format("%.5f", (A + B) / 11));
		
		sc.close();
	}
}