package day13;

import java.util.Scanner;

public class C9_Soru {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz.-");
		String isim=scan.next();
		System.out.println("Lutfen soyisminizi giriniz.-");
		String soyisim=scan.next();
		System.out.println("Lutfen kart numaranizi giriniz.-");
		String kartNo=scan.next();
		
		char isimIlkHarf=isim.toUpperCase().charAt(0);
        String isimGeriKalan=isim.substring(1).replaceAll("\\w","*");
        String soyisimIlkHarf=soyisim.toUpperCase().substring(0,1);
        String soyisimGeriyeKalan=soyisim.substring(1).replaceAll("\\w","*");
        String kartNoBasi="**** **** **** ";
        String kartSonu=kartNo.substring(kartNo.length()-4);
        System.out.println("Isminiz ve soyisminiz:" +isimIlkHarf+isimGeriKalan+" "+soyisimIlkHarf+soyisimGeriyeKalan+" Kart No:  "+kartNoBasi+kartSonu);
        
	}

}
