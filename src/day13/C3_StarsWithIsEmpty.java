package day13;

public class C3_StarsWithIsEmpty {

	public static void main(String[] args) {
		String str="Her gun java olsa ";
		System.out.println(str.startsWith("H"));
		System.out.println(str.startsWith("Her "));
		System.out.println(str.startsWith("g", 4));
		System.out.println(str.startsWith("java", 7));
	
		
		System.out.println(str.isEmpty());
		String str2="";
		System.out.println(str2.isEmpty());
		String str3=null;//null bir deger degildir sadece pointerdir.str3 un hicbirseye esit olmadigini gosteren pointerdir.
		System.out.println(str3.isEmpty());
		System.out.println(str.isBlank());
	}

}
