package day11_stringManipulation;

public class C1_concatination {

	public static void main(String[] args) {
		System.out.println(15+20+"merhaba");
		System.out.println("merhaba"+15+20);
		System.out.println("merhaba"+(15+20));
		System.out.println("merhab"+15*20);
		
		String str1="Hello";
		String str2=" World";
		System.out.println(str1.concat(str2));
	}

}
