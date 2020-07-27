package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int x = A * 60 + B;
		int x2 = C * 60 + D;

		int dif = (24 * 60 - x) + x2;
		
		int hours = dif / 60;
		int minutes = dif % 60;
		
		if (hours >= 24 && minutes >= 1) {
			hours = hours % 24;
		}
		
		System.out.println("O JOGO DUROU " + Math.abs(hours) + " HORA(S) E " + Math.abs(minutes) + " MINUTO(S)");
		
		sc.close();
	}
}