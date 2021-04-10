package day18_WhileLoop;

import java.util.Scanner;

public class C1_NetedForLoop {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen carpim tablosu icin bir rakam giriniz. ");
		int rakam = scan.nextInt();
		for(int i=1;i<=rakam;i++) {
			for(int j=1;j<=rakam;j++) {
				System.out.print(i*j+"");
			}
		System.out.println("");
		}
		
		

	}

}
