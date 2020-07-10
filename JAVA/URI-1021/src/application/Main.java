package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] notas = { 100.00, 50.00, 20.00, 10.00, 5.00, 2.00 };
		double[] moedas = { 1.00, 0.50, 0.25, 0.10, 0.05, 0.01 };
		
		double valor = sc.nextDouble();
		int x = 0;
		
		System.out.println("NOTAS:");
		for (int i = 0; i < notas.length; i++) {
			x = (int) (valor / notas[i]);
			System.out.println(x + " nota(s) de R$ " + String.format("%.2f", notas[i]));
			valor %= notas[i]; 
		}
		
		valor = valor * 100;
		
		System.out.println("MOEDAS:");
		for (int i = 0; i < moedas.length; i++) {
			x = (int) (valor / (moedas[i] * 100));
			System.out.println(x + " moeda(s) de R$ " + String.format("%.2f", moedas[i]));
			valor = valor % (moedas[i] * 100);
		}
		
		sc.close();
	}
}