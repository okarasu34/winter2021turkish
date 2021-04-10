package day07;

import java.util.Scanner;

public class C7_IfElse07 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen iki sayi giriniz");	
        double a=scan.nextDouble();
		double b=scan.nextDouble();
	    
	    
	   if(a==0||b==0) {
			
     System.out.println("sifir carpmaya gore yutan elemandir.");
		}
	    else if(a>0&&b>0) {
		
		System.out.println("Sayilarin toplami: " +(a+b));
	}else if(a<0&&b<0) {
		
		System.out.println("sayilarin carpimi: " +(a*b));
	}else {
		System.out.println("farkli isaretlerle islem yapamazsiniz");
	}
	
	
	
	}

}
