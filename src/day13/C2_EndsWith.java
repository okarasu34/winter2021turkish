package day13;

import java.util.Scanner;

public class C2_EndsWith {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir email adresi giriniz..");
		String email = scan.next();
		if (!email.contains("@")) {
			System.out.println("girdiginiz bilgi email degildir..");
		} else if (!email.contains("@gmail.com")) {
			System.out.println("girdiginiz bilgi gmail icermiyor..");
		} else if (email.endsWith("@gmail.com")) {
			System.out.println("Giris basarili..");
		} else {
			System.out.println("gecersiz gmail adresi");
			scan.close();
		}

	}

}
