package day10_ternary;

import java.util.Scanner;

public class C3_SwitchCase {

	public static void main(String[] args) {
		// Kullanicidan bir rakam isteyin girilen rakami yaziyla yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir rakam giriniz..");
		int sayi = scan.nextInt();
		if (sayi == 1) {
			System.out.println("bir");
		} else if (sayi == 2) {
			System.out.println("iki");
		} else if (sayi == 3) {
			System.out.println("uc");
		} else if (sayi == 4) {
			System.out.println("dort");
		} else if (sayi == 5) {
			System.out.println("bes");
		} else if (sayi == 6) {
			System.out.println("alti");
		} else if (sayi == 7) {
			System.out.println("yedi");
		} else if (sayi == 8) {
			System.out.println("sekiz");
		} else if (sayi == 9) {
			System.out.println("dokuz");
		} else if (sayi == 0) {
			System.out.println("sifir");
		} else {
			System.out.println("giris yanlis");
		}

	}

}
