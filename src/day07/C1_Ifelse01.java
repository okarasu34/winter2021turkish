package day07;

import java.util.Scanner;

public class C1_Ifelse01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	    System.out.println("Lutfen bir tamsayi giriniz");
		int sayi=scan.nextInt();
	
	if(sayi>0) {
		System.out.println("sayi pozitiftir..");
	}
	if(sayi>1000) {
		System.out.println("buyuk sayi ");
	}
	
	if(sayi<100) {
		System.out.println("kucuk sayi ");
	}
	
	
	
	}

}
