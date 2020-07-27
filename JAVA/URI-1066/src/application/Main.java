package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pair = 0;
		int odd = 0;
		int positive = 0;
		int negative = 0;
		
		for (int i = 0; i < 5; i++) {
			int x = sc.nextInt();
			
			if (x % 2 == 0) {
				pair++;
			} else {
				odd++;
			}
			if (x > 0) {
				positive++;
			} else if(x < 0) {
				negative++;
			}
		}
		
		System.out.println(pair + " valor(es) par(es)");
		System.out.println(odd + " valor(es) impar(es)");
		System.out.println(positive + " valor(es) positivo(s)");
		System.out.println(negative + " valor(es) negativo(s)");
		
		sc.close();
	}
}