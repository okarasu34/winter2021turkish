package day09_ternary;

import java.util.Scanner;

public class C4_ternary4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir tamsayi giriniz");
       int sayi=scan.nextInt();
	   System.out.println(sayi%2==0 ? "sayi cifttir" :"sayi tektir");
	System.out.println("sayinin mutlak degeri : " +(sayi>0 ?sayi:-sayi));
	}

}
