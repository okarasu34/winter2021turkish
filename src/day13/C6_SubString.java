package day13;

public class C6_SubString {

	public static void main(String[] args) {
		String str="Her ders java gibi olsa";
		System.out.println(str.substring(10)); //10. index dahil yani inclusive sonuna kadar tum stringi yazar
		System.out.println(str.substring(str.length()-10));
		System.out.println(str.substring(0, 10)); //Substring(0, 10) yazildiginda 0 inclusive 10 exclusive
		System.out.println(str.substring(10 ));
		System.out.println("**********"+str.substring(10));
		System.out.println(str.substring(10, 10));//Baslangic indeksi olsun de;ama bitis indeksi olmasin der olmaz inclusive,exclusive en guncel bu der onu yapar.
		//System.out.println(str.substring(8, 7));//Hata verir
		System.out.println(str.substring(23));//lenght -1 son karakteri verir,lenght i yazarsaniz bosluk verir
		
		
	}

}
