package day19_DoWhileLoop;

import java.util.Scanner;

public class C2_Flag {

	public static void main(String[] args) {
		// kullanicidan bir cumle alin
		// While loop Cumlede buyuk harf var mi ,yok mu yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		String flag = "yok";
		int index = 0;
		
		while (index < cumle.length()) {
			if (cumle.charAt(index)>='A'&&cumle.charAt(index)<='Z') {
				flag="var";
			}
			index++;
		}

		System.out.println("Cumlede  adet büyük harf kullanilmis.");

	}

}
