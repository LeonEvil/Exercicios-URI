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
		
		double aux = A;
		
		if (B > A && B > C) {
			A = B;
			B = aux;
		} else if (C > A && C > B) {
			A = C;
			C = aux;
		}
		
		if (A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if (A * A == B * B + C * C) {
				System.out.println("TRIANGULO RETANGULO");
			}

			if (A * A > B * B + C * C) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
				
			if (A * A < B * B + C * C) {
				System.out.println("TRIANGULO ACUTANGULO");
			}	
			
			if (A == B && A == C && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (A == B || A == C || B == C) {
				System.out.println("TRIANGULO ISOSCELES");
			}	
		}
		
		sc.close();
	}
}