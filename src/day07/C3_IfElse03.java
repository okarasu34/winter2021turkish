package day07;

import java.util.Scanner;

public class C3_IfElse03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Bir karakter giriniz....");
	    char karakter=scan.next().charAt(0);
	
	    
	    if ((karakter>='a'&&karakter<='z')||(karakter>='A'&&karakter<='Z')) {
	System.out.println("Girdiginiz karakter harftir.");		
		} else {
      System.out.println("Girdiginiz karakter harf degildir...");
		}
	    scan.close();
	}

}
