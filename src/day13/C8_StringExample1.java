package day13;

import java.util.Iterator;
import java.util.Scanner;

public class C8_StringExample1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("4 harfli bir kelime giriniz");
		String str=scan.nextLine();
		
		
		if(str.length()!=4) {
			System.out.println("Lutfen dort harfli bir kelime giriniz");
		}else {
			System.out.print(str.substring(3));
			System.out.print(str.substring(2, 3));
			System.out.print(str.substring(1, 2));
			System.out.print(str.substring(0, 1));
			System.out.print(" "+str.charAt(3));
			System.out.print(str.charAt(2));
			System.out.print(str.charAt(1));
			System.out.print(str.charAt(0));
		}
	}

}
