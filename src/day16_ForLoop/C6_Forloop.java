package day16_ForLoop;

import java.util.Scanner;

public class C6_Forloop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen tersinden yazdirmak icin bir string giriniz");
		String yazi= scan.nextLine();
		String tersYazi="";
         for(int i=yazi.length()-1;i>=0;i--) {
        	 
        	 tersYazi+=yazi.charAt(i);
        	
         }
         System.out.println("tersten yazilisi:" + tersYazi);
         
	}
	}


