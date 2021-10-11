package day12;

public class C1_equals1 {

	public static void main(String[] args) {
		
		
		String str1="Ali Can";
		String str2=str1+"";
		System.out.println(str2);
		System.out.println(str1==str2);//Bu satir false verir cunku == isareti hem objeye bakar hemde adreslere bakar 
		                                //obje ayni ama adresler farkli oldugu icin false verir.
		System.out.println(str1.equals(str2));//bu isaret sadece objeye bakar ve esit oldugu icin true dondurur.
		String str3=str1;
		System.out.println(str3==str1);
		System.out.println(str1.equals(str3));
		
		
		
	}

}
