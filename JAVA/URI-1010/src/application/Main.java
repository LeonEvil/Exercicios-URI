package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		
		for (int i = 0; i < 2; i++) {
			int cod = sc.nextInt();
			int qtd = sc.nextInt();
			double preco = sc.nextDouble();
			
			total += qtd * preco;
		}
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", total));
		
		sc.close();
	}
}