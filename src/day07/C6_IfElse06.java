package day07;

import java.util.Scanner;

public class C6_IfElse06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
	    double not=scan.nextDouble();
	
	if(not<0||not>100) {
		System.out.println("Lutfen gecerli bir nor giriniz...");
	}
	else if (not<50) {
		System.out.println("Notunuz  : D" );
	}
	else if(not<60) {
		System.out.println("Notunuz :C");
	}
	else if(not<80) {
		System.out.println("Notunuz :B" );
	}else  {
		System.out.println("Notunuz :A" );
	}
	scan.close();	
		
	}
	}


