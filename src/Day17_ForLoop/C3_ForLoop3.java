package Day17_ForLoop;

import java.util.Scanner;

public class C3_ForLoop3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 35 ten kucuk bir tamsayi giriniz");
		int sayi = scan.nextInt();
		if (sayi<=0||sayi>=35) {
			System.out.println("gecerli bir sayi giriniz");
		} else {
			faktoriyelBul(sayi);
		}
		
		
	}

	public static void faktoriyelBul(int sayi) {
		long faktoriyel=1;
		for(int i=1;i<=sayi;i++) {
			faktoriyel*=i;
		}
		System.out.println(faktoriyel);
	}

}
