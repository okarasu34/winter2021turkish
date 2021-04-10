package day15_MethodCreation;

public class C3_MethodOverloading1 {

	public static void main(String[] args) {
		//java da ayni isimle birden fazla method olusturulmasina overlodading denir.
		//fakat method signature lar farkli olmalidir
		//method signature=	isim+parametre sayisi+parametre data turu.
			toplama("Ali","Veli");
		}

		public static void toplama(int sayi1,int sayi2) {
			System.out.println("int sonuc:"+(sayi1+sayi2));
		}
		
		public static void toplama(double sayi1,double sayi2) {
			System.out.println("double sonuc:"+(sayi1+sayi2));
		}
		public static void toplama(int sayi1,double sayi2) {
			System.out.println("int double sonuc:"+(sayi1+sayi2));
		}
		public static void toplama(char char1,char char2) {
			System.out.println("char sonuc:"+(char1+char2));
		}
		public static void toplama(String str1,String str2) {
			System.out.println("string sonuc:"+(str1+str2));
		}
		
	


		
		
	}


