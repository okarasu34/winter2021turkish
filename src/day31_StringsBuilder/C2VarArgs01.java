package day31_StringsBuilder;

public class C2VarArgs01 {

	public static void main(String[] args) {
		//verilen iki sayiyi toplayan ve sonucu yazdiran bir metod yazdiri
		int sayi1=10;
		int sayi2=20;
		int sayi3=30;
		toplama(sayi1,sayi2);
		toplama(sayi1,sayi2,sayi3);
		toplama(2,3);
		toplama(2,5,8);
        
	}

	public static void toplama(int sayi1, int sayi2, int sayi3) {
		System.out.println("Uc sayinin toplami:"+(sayi1+sayi2+sayi3));
		
	}

	public static void toplama(int sayi1, int sayi2) {
		System.out.println("Iki sayinin toplami:"+(sayi1+sayi2));
		
	}

}
