package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] numbers = new double[6];
		int positive = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextDouble();
			if (numbers[i] > 0.0) {
				positive++;
			}
		}
		
		System.out.println(positive + " valores positivos");
		
		sc.close();
	}
}