package day03;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen sadece isminizi giriniz");
		String name=scan.nextLine();
		System.out.println("Lutfen soyisminizi giriniz");
		String surname=scan.nextLine();
		System.out.println("Isminiz : " + name );
		System.out.println("Soyisminiz :"+ surname);
	System.out.println("Kaydiniz alinmistir.Tesekkurler....");
	
	}

}
