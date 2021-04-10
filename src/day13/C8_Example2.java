package day13;

public class C8_Example2 {

	public static void main(String[] args) {
		
		String str1="$13.99";
		String str2="$10.55";
		str1=str1.replaceAll("\\D", "");
		System.out.println(str1);
		
		str2=str2.replaceAll("\\D", "");
		System.out.println(str2);//parsedouble metodu cunku primitive veriler metoda sahip degiller bunun
		
		double sayi1=Double.parseDouble(str1);
	   double sayi2=Double.parseDouble(str2);
	   double toplam=(sayi1+sayi2)/100;
			   System.out.println(toplam);
	}

}
