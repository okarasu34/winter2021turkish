package day09_ternary;

import java.util.Scanner;

public class C6_NestedTernary6 {

	public static void main(String[] args) {
		// soru: kullanicidan bir harf isteyin kucuk harfse kucuk buyuk harfse konsola buyuk harf yazdirin.

		Scanner scan=new Scanner(System.in);
		System.out.println("bir harf giriniz");
		char birHarf=scan.next().charAt(0);
		System.out.println((birHarf>='A'&&birHarf<='Z' )?"buyuk harf":" kucuk harf");
		
	}

}
