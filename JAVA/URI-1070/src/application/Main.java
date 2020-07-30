package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int cont = 0;
		
		for (int i = x; cont != 6; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
				cont++;
			}
		}
		sc.close();
	}
}