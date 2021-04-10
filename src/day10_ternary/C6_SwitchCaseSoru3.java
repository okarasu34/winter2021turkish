package day10_ternary;

import java.util.Scanner;

public class C6_SwitchCaseSoru3 {

	public static void main(String[] args) {
		//kullanicidan hangi gunde oldugunuzu isteyin,girilien gunun haftaici veya hafta sonu oldugunu yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun adi giriniz..");
		String gun = scan.next().toLowerCase();
		switch(gun) {
		case "pazartesi":
		case "sali":
		case "carsamba":
		case "persembe":
		case "cuma":
			System.out.println("haftaici");
		break;
		case "cumartesi":
		case "pazar":
		System.out.println("haftasonu");
		break;
		default:
			System.out.println("girilen gun gecersiz..");
		scan.close();
		
		
		
		}
		
		
		
	}

}
