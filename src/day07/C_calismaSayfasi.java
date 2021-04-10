package day07;

import java.util.Scanner;

public class C_calismaSayfasi {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
       double sayi=scan.nextDouble();
        if(sayi%4==0) {
    	  System.out.println("sayi dorde tam bolunur...");
      }
       else  {
    	   System.out.println("dorde bolunebilen bir sayi giriniz...");
       }
	}

}
