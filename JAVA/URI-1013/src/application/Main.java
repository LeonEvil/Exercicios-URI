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
		
		int X = (A + B + Math.abs(A - B)) / 2;
		
		System.out.println(Math.max(C, X) + " eh o maior");
		
		sc.close();
	}
}