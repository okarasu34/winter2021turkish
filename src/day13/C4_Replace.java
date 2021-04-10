package day13;

import java.util.Scanner;

public class C4_Replace {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz..");
		String cumle = scan.nextLine();
		cumle=cumle.replace(" ","");
		cumle.replace(" ","x");
		System.out.println(cumle.replace(" ",""));
		System.out.println(cumle.replace(" ","x"));
System.out.println(cumle.replace(" ", "").replace('i','e'));
		
	}

}
