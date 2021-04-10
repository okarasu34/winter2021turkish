package day08;

import java.util.Scanner;

public class C1_IfElseIf1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen gun ismini giriniz...");
		String gunIsmi=scan.nextLine();
		if(gunIsmi.equals("pazar")||gunIsmi.equalsIgnoreCase("pazartesi")) {
			System.out.println("paz");
		}
		else if(gunIsmi.equalsIgnoreCase("sali")) {
			System.out.println("sal");
		}
		else if(gunIsmi.equalsIgnoreCase("carsamba")) {
			System.out.println("car");
		}
		else if(gunIsmi.equalsIgnoreCase("persembe")) {
			System.out.println("per");
		}
		else if(gunIsmi.equalsIgnoreCase("cuma")||gunIsmi.equalsIgnoreCase("cumartesi")) {
			System.out.println("cum");
		}else {
			System.out.println("Lutfen gecerli bi bir gun ismi giriniz...");
		}
		
		scan.close();
	}

}
