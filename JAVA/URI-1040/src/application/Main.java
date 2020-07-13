package application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat(".0");
		
		double A = sc.nextDouble() * 2.0;
		double B = sc.nextDouble() * 3.0;
		double C = sc.nextDouble() * 4.0;
		double D = sc.nextDouble() * 1.0;
		
		double media = (A + B + C + D) / 10.0;
		
		System.out.println("Media: " + df.format(media));
		
		if (media >= 7.0) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
			double exame = sc.nextDouble();
			System.out.println("Nota do exame: " + df.format(exame));
			media = (media + exame) / 2;
			
			if (media >= 5.0) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			
			System.out.println("Media final: " + df.format(media));
		}

		sc.close();
	}
}