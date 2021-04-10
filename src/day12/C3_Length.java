package day12;

import java.util.Scanner;

public class C3_Length {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz..");
		String str=scan.nextLine().toUpperCase();
		
		System.out.println("girdiginiz stringin son harfi:"+str.charAt(str.length()-1));
		System.out.println(str); 
       String str2="";
       System.out.println(str2.length());
       String str3=null;
       System.out.println(str3.length());
       
       
	}

}
