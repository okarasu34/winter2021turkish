package day15_MethodCreation;

import java.util.Scanner;

public class C2_MethodCreation2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac sayi toplamak istiyorsunuz");
		int adet = scan.nextInt();
		
		
		
		if (adet < 2) {
			System.out.println("en az 2 sayi girmelisiniz");
		} else if (adet == 2) {
			ikiSayiTopla();
		} else if (adet == 3) {
			ucSayiTopla();
		} else if (adet == 4) {
			dortSayiTopla();
		} else {
			System.out.println("cok sayi girdiniz ,ben toplayamam");
		}

	}

	public static void dortSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen dort sayi giriniz..");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		System.out.println("sayilarin toplami:"+ (sayi1+sayi2+sayi3+sayi4));
	scan.close();
	
	}
	

	public static void ucSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen uc sayi giriniz..");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		System.out.println("sayilarin toplami:"+ (sayi1+sayi2+sayi3));
		scan.close();
	}

	public static void ikiSayiTopla() {
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz..");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		System.out.println("sayilarin toplami:"+ (sayi1+sayi2));
		scan.close();
	}

}
