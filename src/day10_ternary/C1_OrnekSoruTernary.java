package day10_ternary;

import java.util.Scanner;

public class C1_OrnekSoruTernary {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz..");
		int sayi=scan.nextInt();
		
		String sonuc=sayi>99? (sayi<1000? "sayi uc basamakli" :"uc bsamakli degil"):"uc basamakli degil";
		
		System.out.println(sonuc);

	}

}
