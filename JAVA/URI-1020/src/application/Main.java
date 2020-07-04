package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		System.out.println(x / 365 + " ano(s)");
		System.out.println(x % 365 / 30 + " mes(es)");
		System.out.println(x % 365 % 30 + " dia(s)");
		
		sc.close();
	}
}