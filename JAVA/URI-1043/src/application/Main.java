package application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".0");
		
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		
		if ((a < (b + c) && b < (a + c) && c < (a + b))) {
			System.out.println("Perimetro = " + df.format(a + b + c));
		} else {
			System.out.println("Area = " + df.format((a + b) * c / 2.0));
		}
		sc.close();
	}
}