package day13;

public class C5_ReplaceAll {

	public static void main(String[] args) {
		
		String str="Java ogren, mutlu ol,java candir 12345";
		System.out.println(str.replaceAll("\\w","*" ));
		System.out.println(str.replaceAll("\\W","*" ));
		System.out.println(str.replaceAll("\\d","." ));
		System.out.println(str.replaceAll("\\D","." ));
		System.out.println(str.replaceAll("\\s","&" ));
		System.out.println(str.replaceAll("\\S","&" ));
		System.out.println(str.replaceAll("\\d","" ));
		System.out.println(str.replaceFirst("\\d","&" ));

	}

}
