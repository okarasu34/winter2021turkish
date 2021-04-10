package day04;

import java.util.Scanner;

public class C3_Modulus2 {

	public static void main(String[] args) {
		Scanner scan=new  Scanner(System.in);
        System.out.println("Basamaklarini bulmak icin dort basamakli bir sayi giriniz.");
	    int sayi=scan.nextInt(); 
	    int birlerBas=sayi%10;
	    sayi/=10;
	    int onlarBas=sayi%10;
	    sayi/=10;
	    int yuzlerBas=sayi%10;
	    sayi/=10;
	    int binlerBas=sayi;
	    System.out.print(birlerBas);
	    System.out.print(onlarBas);
	    System.out.print(yuzlerBas);
	    System.out.println(binlerBas);
	System.out.println(birlerBas+onlarBas+yuzlerBas+binlerBas);
	
	}

}
