package day02;

import java.util.Scanner;

public class C1_Scanner {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Karenin bir kenar uzunlugunu giriniz");
	double kenar= scan.nextDouble();
	
	System.out.println("karenin alani:" +kenar*kenar);
	}
	

}
