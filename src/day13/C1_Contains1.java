package day13;

import java.util.Scanner;

public class C1_Contains1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz..");
		String cumle = scan.nextLine().toLowerCase();
		System.out.println("lutfen aramami istediginiz stringi giriniz");
		String aranan = scan.nextLine().toLowerCase();

		System.out.println(cumle.contains(aranan) ? "basarili" : "basarisiz");

		System.out.println("Lutfen bir email adresi giriniz..");
		String email = scan.next();

		System.out.println(email.contains("@gmail.com") ? "mailiniz kaydedildi" : "gecerli bir mail adresi giriniz");
		email.indexOf("@gmail.com", email.length() - 10);

	}

}
