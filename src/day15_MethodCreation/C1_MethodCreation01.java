package day15_MethodCreation;

import java.util.Scanner;

public class C1_MethodCreation01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir tamsayi giriniz..");
		int sayi = scan.nextInt();

		pozitifNegatif(sayi);
		tekMiCiftMI(sayi);
		if (sayi >= 100) {
			yuzdenBuyuk(sayi);
		} else {
			yuzdenKucuk(sayi);
		}
	}

	public static void yuzdenKucuk(int sayi) {
		System.out.println(sayi % 10);
	}

	public static void yuzdenBuyuk(int sayi) {
		int rakamlarToplami = 0;
		rakamlarToplami = sayi % 10;
		sayi /= 10;
		rakamlarToplami += sayi % 10;
		sayi /= 10;
		rakamlarToplami += sayi % 10;
		System.out.println("rakamlar toplami:" + rakamlarToplami);
	}

	public static void pozitifNegatif(int sayi) {
		System.out.println(sayi > 0 ? " pozitif" : (sayi < 0 ? "negatif" : "pozitif veya negatif degil"));

	}

	public static void tekMiCiftMI(int sayi) {
		if (sayi % 2 == 0) {
			System.out.println("sayi cifttir");
		} else {
			System.out.println("sayi tektir");
		
		}

	}

}

