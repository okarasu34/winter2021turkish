package day07;

import java.util.Scanner;

public class C2_IfElse02 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Kenar uzunluklarini giriniz...");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if(kenar1==kenar2) {
			
			System.out.println("Karedir alani:" +(kenar1*kenar2));
		}else {
			
			System.out.println("Dikdortgendir ve alani:" +(kenar1*kenar2));
		}
		scan.close();
		
	}

}
