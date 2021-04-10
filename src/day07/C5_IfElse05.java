package day07;

import java.util.Scanner;

public class C5_IfElse05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ucgenin kenarlarini giriniz");
        double alan;
        double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		double kenar3=scan.nextDouble();
	if(kenar1==kenar2&&kenar2==kenar3) {
	
		System.out.println("eskenar ucgen");
	}else {
		System.out.println("eskenar degil...");
	}
	scan.close();
}
}
