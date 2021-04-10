package day16_ForLoop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen pozitif bir sayi giriniz.");
		int sayi=scan.nextInt();
		int toplam=0;
	for(int i=1;i<=sayi;i++) {
		toplam+=i;
	}
	
	System.out.println(toplam);
	
	}

}
