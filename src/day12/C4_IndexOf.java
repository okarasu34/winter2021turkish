package day12;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
	    String str="Java ogren, is sahibi ol";
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf('g'));
		System.out.println(str.indexOf("g"));
		System.out.println(str.indexOf("is"));
System.out.println(str.indexOf('i'));
System.out.println(str.indexOf('a', 4));
	System.out.println(str.indexOf("dert"));
	
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz..");
		String cumle=scan.nextLine();
		int sonuc=cumle.indexOf("java");
	System.out.println(sonuc==-1?"java icermiyor":"java iceriyor");
	if(cumle.indexOf("java")>=0) {
		System.out.println("java iceriyor");
	}else {
		System.out.println("java icermiyor");
	}
	
	}

}