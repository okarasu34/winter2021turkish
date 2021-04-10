package day09_ternary;

import java.util.Scanner;

public class C5_NestedTernary1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("iki adet sayi giriniz");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
	
	
String sonuc=kenar1>0&&kenar2>0 ?(kenar1==kenar2)? "karedir":"dikdortgendir":"gecerli degil";
	
	System.out.println(sonuc);
	}

}
