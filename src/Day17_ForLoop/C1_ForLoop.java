package Day17_ForLoop;

import java.util.Scanner;

public class C1_ForLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
		int sayi = scan.nextInt();
        System.out.println();
	if(sayi<=0) {
		System.out.println("Lutfen bir tamsayi giriniz");
	}else {
		rakamlarToplamiYazdir(sayi);
		
	}
	
	
	
	}

	public static void rakamlarToplamiYazdir(int sayi) {
		int rakamlarToplami=0;
		String sayi2=sayi+"";
		for(int i=1;i<=sayi2.length();i++) {
			rakamlarToplami+=sayi%10;
			sayi/=10;
		}
		System.out.println("rakamlar toplami:"+rakamlarToplami);
	}

}
