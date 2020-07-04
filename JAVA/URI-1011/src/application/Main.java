package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int R = sc.nextInt();
		
		System.out.println("VOLUME = " + String.format("%.3f", (4.0 / 3) * 3.14159 * Math.pow(R, 3)));
		
		sc.close();
	}
}