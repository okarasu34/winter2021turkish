package day06;

import java.util.Scanner;

public class C4_IfStatement4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gunu giriniz");
		String gunAdi=scan.next().toLowerCase();
		if(gunAdi.equals("cumartesi")||gunAdi.equals("pazar")) {
			System.out.println("Haftasonu");
		}
		if(gunAdi.equals("pazartesi")||gunAdi.equals("sali")||gunAdi.equals("carsamba")||gunAdi.equals("persembe")||gunAdi.equals("cuma")) {
			System.out.println("haftaici");
		}
		else {
			System.out.println("Gecersiz bir gun ismi girdiniz lutfen bir daha deneyiniz...");
		}
		scan.close();
	}

}
