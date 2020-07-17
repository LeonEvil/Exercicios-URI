package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > B) {
			System.out.println("O JOGO DUROU " + Math.abs(24 - A + B) + " HORA(S)");
		} else if (A < B){
			System.out.println("O JOGO DUROU " + Math.abs(A - B) + " HORA(S)");
		} else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}
		
		sc.close();
	}
}