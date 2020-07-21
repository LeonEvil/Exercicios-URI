package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String info1 = sc.nextLine();
		String info2 = sc.nextLine();
		String info3 = sc.nextLine();

		if (info1.equals("vertebrado") && info2.equals("ave") && info3.equals("carnivoro")) {
			System.out.println("aguia");
		}
		if (info1.equals("vertebrado") && info2.equals("ave") && info3.equals("onivoro")) {
			System.out.println("pomba");
		}
		if (info1.equals("vertebrado") && info2.equals("mamifero") && info3.equals("onivoro")) {
			System.out.println("homem");
		}
		if (info1.equals("vertebrado") && info2.equals("mamifero") && info3.equals("herbivoro")) {
			System.out.println("vaca");
		}

		if (info1.equals("invertebrado") && info2.equals("inseto") && info3.equals("hematofago")) {
			System.out.println("pulga");
		}
		if (info1.equals("invertebrado") && info2.equals("inseto") && info3.equals("herbivoro")) {
			System.out.println("lagarta");
		}
		if (info1.equals("invertebrado") && info2.equals("anelideo") && info3.equals("hematofago")) {
			System.out.println("sanguessuga");
		}
		if (info1.equals("invertebrado") && info2.equals("anelideo") && info3.equals("onivoro")) {
			System.out.println("minhoca");
		}

		sc.close();
	}
}