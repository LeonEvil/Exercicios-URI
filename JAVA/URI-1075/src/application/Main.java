package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		for (int i = 1; i <= 10000; i++) {
			if (i % x == 2) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}