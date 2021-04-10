package day06;

import java.util.Scanner;

public class C5_IfStatement5 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
       System.out.println("Lutfen dikdortgenin iki kenarini giriniz");
       double alan;
       double kenar1=scan.nextInt();
	   double kenar2=scan.nextInt();
	   
	if(kenar1==kenar2) {
		alan=kenar1*kenar2;
		System.out.println("Kare " + alan);
	}
	else {
		alan=kenar1*kenar2;
		System.out.println("Dikdortgen "+alan);
	
	}
	scan.close();
	
	}

}
