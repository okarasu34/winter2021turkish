package day07;

import java.util.Scanner;

public class C4_IfElse04 {

	public static void main(String[] args) {
		// Kullanicidan yasini sorun,eger 65 ten buyukse "emekli olabilirsin" diye yazdirin yoksa 
		//"emekli olamzasin" yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz...");
		int yas=scan.nextInt();
		if (yas>=65) {
			System.out.println("Emekli olabilirsiniz..");
			
		}else {
			System.out.println("Emekli olmazsiniz...");
		}

	}

}
