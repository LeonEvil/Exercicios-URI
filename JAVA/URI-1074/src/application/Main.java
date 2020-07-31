package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			int a = sc.nextInt();
			
			if (a != 0) {
				if (a % 2 == 0) {
					System.out.print("EVEN");
				} else {
					System.out.print("ODD");
				}
				
				System.out.print(" ");
				
				if (a > 0) {
					System.out.println("POSITIVE");
				} else {
					System.out.println("NEGATIVE");
				}
			} else {
				System.out.println("NULL");
			}
		}
		
		sc.close();
	}
}