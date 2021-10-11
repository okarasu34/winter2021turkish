package day11_stringManipulation;

import java.util.Locale;

public class C3_LowerUpperCase {

	public static void main(String[] args) {
	
		String str="Techproeducation";
		System.out.println(str.toUpperCase());
		str=str.toUpperCase();
		System.out.println(str);
		System.out.println(str.toLowerCase(Locale.forLanguageTag("tr")));

	}

}
