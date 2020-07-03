package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double salario = sc.nextDouble();
		double vendas = sc.nextDouble();
		
		System.out.println("TOTAL = R$ " + String.format("%.2f", salario + (vendas * 15) / 100));
		
		sc.close();
	}
}