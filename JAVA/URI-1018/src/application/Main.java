package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = 0;
		int[] notas = { 100, 50, 20, 10, 5, 2, 1};
		
		System.out.println(x);
		
		for (int i = 0; i < notas.length; i++) {
			y = x / notas[i];
			x %= notas[i];
			System.out.println(y + " nota(s) de R$ " + notas[i] + ",00");
		}
		
		sc.close();
	}
}