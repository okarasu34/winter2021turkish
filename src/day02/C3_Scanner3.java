package day02;

import java.util.Scanner;

public class C3_Scanner3 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz");
		String name=scan.nextLine();
	
	    System.out.println("Lutfen soyisminizi giriniz" );
	    String surname=scan.nextLine();	
		System.out.println(name + "  "  +surname);
		
		
		
	}

}
