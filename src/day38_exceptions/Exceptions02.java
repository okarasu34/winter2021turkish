package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {
		int count =1;
		Scanner scan = new Scanner(System.in);
		while (count <= 100) {

			System.out.println("Lutfen bolunecek sayiyi yaziniz");
			int sayi1 = scan.nextInt();
			System.out.println("Lutfen kaca bolmek istediginizi yazin");
			int sayi2 = scan.nextInt();
            System.out.println("islem no:"+count);
            try {
            	System.out.println("bolme isleminin sonucu:"+sayi1/sayi2);
    			
            }catch(ArithmeticException e) {
            	System.out.println("sayiyi sifira bolemezsin.");
            }
            count++;
			
		}
	}
}
