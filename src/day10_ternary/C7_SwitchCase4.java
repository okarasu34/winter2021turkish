package day10_ternary;

import java.util.Scanner;

public class C7_SwitchCase4 {

	public static void main(String[] args) {
		//kullanicidan VIP kisaltmasinda hangi harfin anlamini istedigini soralim
		//girilen harfin anlamini yazdiralim
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf girin");
		String str = scan.next();
		switch(str) {
		case"v":
		case "V":
			System.out.println("Very");
			break;
		case "i":
		case "I":
			System.out.println("Important");
			break;
		case "p":
		case "P":
			System.out.println("Person");
			break;
			default:
				System.out.println("girilen harf gecersiz");
		
		
		
		
		scan.close();
		
		}
		
		
		
	}

}
