package day10_ternary;

import java.util.Scanner;

public class C2_OrnekSoruTernary2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz..");
		int sayi=scan.nextInt();
		 
		String sonuc=sayi%2==0? "sayi cifttir":sayi*sayi+"";
				 System.out.println(sonuc);
		
		
	}

}
