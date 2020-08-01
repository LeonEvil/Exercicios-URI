package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int result = 0;

		if (a < b) {
			for (int i = a + 1; i < b; i++) {
				if (i % 2 != 0) {
					result += i;
				}
			}
		} else {
			for (int i = b + 1; i < a; i++) {
				if (i % 2 != 0) {
					result += i;
				}
			}
		}
		
		System.out.println(result);
		
		sc.close();
	}
}