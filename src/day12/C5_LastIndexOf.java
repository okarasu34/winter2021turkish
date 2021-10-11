package day12;

import java.util.Scanner;

public class C5_LastIndexOf {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle=scan.nextLine().toLowerCase();
		int ilkJava=cumle.indexOf("java");
		int sonJava=cumle.lastIndexOf("java");
		
		if (ilkJava==-1) {
			System.out.println("cumle java icermiyor");
			
		} else if(ilkJava==sonJava) {
			System.out.println("cumle tek 1 java kelimesi iceriyor");

		}else {
			System.out.println("cumle 1'den fazla  java kelimesi iceriyor.");
		}
		
		
		
	}

}
