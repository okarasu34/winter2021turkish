package day32_StringBilder;

public class StringBuilder01 {

	public static void main(String[] args) {
	StringBuilder sb1=new StringBuilder("Rumeysa");
	System.out.println(sb1);
	sb1.append(" ").append("Cetinturk");
	System.out.println(sb1);
		sb1.append("Javayi cok sever", 6, 10);
		System.out.println(sb1);
		
		System.out.println(sb1.length());
		System.out.println(sb1.capacity());
		sb1.charAt(1);
		System.out.println(sb1.charAt(1));
		sb1.charAt(5);
		System.out.println(sb1);
		sb1.delete(17, 21);
		System.out.println(sb1);
		sb1.deleteCharAt(16);
		System.out.println(sb1);
		String isim="Rumeysa Cetintur";
		System.out.println(sb1.equals(isim));
		StringBuilder sb2=new StringBuilder("Rumeysa Cetintur");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.indexOf("Cetin"));
		System.out.println(sb1.indexOf("e", 6));
		sb1.insert(7," ");
		System.out.println(sb1);
		String cumle="Merhaba dunya";
		
		System.out.println(sb1.insert(0,cumle, 0, 8));
		System.out.println(sb1.lastIndexOf("t"));
	System.out.println(sb1.lastIndexOf("a", 22));
	System.out.println(sb1.replace(8, 15, "Seher"));
	sb1.reverse();
	sb1.reverse();
	System.out.println(sb1);
	sb1.setCharAt(10, 'k');
	System.out.println(sb1);
	System.out.println(sb1.subSequence(8, 13));
	System.out.println(sb1.substring(8));
	StringBuilder sb3=new StringBuilder("Java cok guzel");
	StringBuilder sb4=new StringBuilder("Java cok guzel");
	System.out.println(sb3.equals(sb4));		
	System.out.println(sb3.toString().equals(sb4.toString()));			
	System.out.println(sb3.toString().concat(" insanin sevdikce sevesi geliyor"));	
	System.out.println(sb1.length());
	System.out.println(sb1.capacity());
		sb1.trimToSize();		
		String str1="Hasan";
		String str2="Hakan";
		
		System.out.println(str2.compareTo(str1)	);
		
		
		
	}

}
