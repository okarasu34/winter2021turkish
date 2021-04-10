package day07;

import java.util.Scanner;

public class C8_IfElse08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir teklif giriniz.");
		int maasTeklif = scan.nextInt();
		if (maasTeklif > 80000) {
			System.out.println("Teklif kabul edildi");

		} else if (maasTeklif > 60000) {
			System.out.println("konusabiliriz..");
		} else {
			System.out.println("Teklif kabul edilmedi");

		}

	}

}
