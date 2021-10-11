package day12;

import java.util.Scanner;

public class C4_IndexOf {

	public static void main(String[] args) {
	    String str="Java ogren, is sahibi ol";
		System.out.println(str.charAt(6));
		System.out.println(str.indexOf('g'));//char arama
		System.out.println(str.indexOf("g"));//string arama
		System.out.println(str.indexOf("is")); //bir kelime gibi dusunur ve i nin index ini alir.
        System.out.println(str.indexOf('i'));//ilk buldugu indexi getirir
        System.out.println(str.indexOf('a', 3));// 3. index ten sonra ramaya baslar.3 te dahil olur inclusive
        System.out.println(str.indexOf('a', 4));
        System.out.println(str.indexOf("dert"));
	    
	
	
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir string giriniz..");
		String cumle=scan.nextLine().toLowerCase();
		int sonuc=cumle.indexOf("java");
	    System.out.println(sonuc==-1?"java icermiyor":"java iceriyor");
	
	    if(cumle.indexOf("java")>=0) {
		System.out.println("java iceriyor");
	}else {
		System.out.println("java icermiyor");
		*/
		String str4="Calisirsaniz, java ogrenmek cok kolay";
		System.out.println(str4.lastIndexOf('a'));
		System.out.println(str4.lastIndexOf("lay"));
		System.out.println(str4.lastIndexOf("t"));
		System.out.println(str4.lastIndexOf('a', 11));
	}
	
	}

