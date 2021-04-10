package day06;

import java.util.Scanner;

public class C3_IfStatement3 {

	public static void main(String[] args) {
		  Scanner scan=new Scanner(System.in);
          System.out.println("Lutfen bir kelime giriniz..");
          char ilkHarf=scan.next().toUpperCase().charAt(0);
	      System.out.println(ilkHarf);
	if(ilkHarf=='p'||ilkHarf=='P') {
		System.out.println("pazar pazartesi persembe");
	}
	if(ilkHarf=='s'||ilkHarf=='S') {
		System.out.println("sali ");
	}
	if(ilkHarf=='c'||ilkHarf=='C') {
		System.out.println("carsamba cuma cumartesi");
	}
	else {
		
		System.out.println("Baska bir harf deneyiniz..");
	}
	scan.close();
	}

}
