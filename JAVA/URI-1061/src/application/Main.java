package application;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String day = sc.nextLine().substring(4);
		String[] filds = sc.nextLine().replace(" ", "").split(":");
		int d1 = Integer.parseInt(day);
		int h1 = Integer.parseInt(filds[0]);
		int m1 = Integer.parseInt(filds[1]);
		int s1 = Integer.parseInt(filds[2]);
		
		String day2 = sc.nextLine().substring(4);
		String[] filds2 = sc.nextLine().replace(" ", "").split(":");
		int d2 = Integer.parseInt(day2);
		int h2 = Integer.parseInt(filds2[0]);
		int m2 = Integer.parseInt(filds2[1]);
		int s2 = Integer.parseInt(filds2[2]);

		int seconds = 0;
		int minutes = 0;
		int hours = 0;
		int days = 0;
		
		if(s2 < s1) {
			seconds += (60 - s1) + s2;
			minutes--;
		} else if (s2 > s1) {
			seconds += s2 - s1;
		} else {
			seconds = 0;
		}
		
		if (m2 < m1) {
			minutes += (60 - m1) + m2;
			hours--;
		} else if (m2 > m1) {
			minutes += m2 - m1;
		} else {
			minutes = 0;
		}
		
		if (h2 < h1) {
			hours += (24 - h1) + h2;
			days--;
		} else if (h2 > h1) {
			hours += h2 - h1;
		} else {
			hours = 0;
		}
		
		if (d2 < d1) {
			days += (30 - d1) + d2;
		} else if (d2 > d1) {
			days += d2 - d1;
		} else {
			days = 0;
		}
		
		System.out.println(days + " dia(s)");
		System.out.println(hours + " hora(s)");
		System.out.println(minutes + " minuto(s)");
		System.out.println(seconds + " segundo(s)");
		
		sc.close();
	}
}