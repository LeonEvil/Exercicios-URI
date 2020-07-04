package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		System.out.println("TRIANGULO: " + String.format("%.3f", (A * C) / 2.0));
		System.out.println("CIRCULO: " + String.format("%.3f", 3.14159 * C * C));
		System.out.println("TRAPEZIO: " + String.format("%.3f", (A + B) * C / 2.0));
		System.out.println("QUADRADO: " + String.format("%.3f", Math.pow(B, 2)));
		System.out.println("RETANGULO: " + String.format("%.3f", A * B));
		
		sc.close();
	}
}