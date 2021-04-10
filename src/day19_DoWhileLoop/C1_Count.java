package day19_DoWhileLoop;

import java.util.Scanner;

public class C1_Count {

	public static void main(String[] args) {
	//kullanicidan bir cumle ve bir harf isteyin ve
   //while loop kullanarak istenen harf kac kez kullanilmis bulunuz. 
         Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("Lutfen saymak istediginiz harfi giriniz...");
		String harf=scan.next().substring(0, 1);
		int count=0;
		int index=0;
		while(index<cumle.length()) {
			if(cumle.substring(index, index+1).equals(harf)) {
			count++;
			}
			index++;
		}
		System.out.println("cumlede " + harf+ " harfi "+count+ " defa kullanilmis");
		
	}

}
