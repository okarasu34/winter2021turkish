package day06;

import java.util.Scanner;

public class C2_IfStatement2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if(sayi%2==0) {
			System.out.println("girdiginiz sayi cifttir");
			
		}
		if(sayi%2==1||sayi%2==-1) {
			System.out.println("girdiginiz sayi tektir.");
			scan.close();
		}
	}

}
