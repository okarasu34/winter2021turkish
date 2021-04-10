package day31_StringsBuilder;

public class C1_StringBuilder01 {
public static void main(String[] args) {
	
	StringBuilder sb1=new StringBuilder(10);
	System.out.println("sb1:"+sb1);
	StringBuilder sb2=new StringBuilder("Mehmet");
	System.out.println("sb2:"+sb2);
	
	StringBuilder sb3=new StringBuilder();
	System.out.println("sb3:"+sb3);
	sb1.append(" hoca");
	System.out.println("sb1 append:"+sb1);
	sb2.append(" hoca");
	System.out.println("sb2 append:"+sb2);
	sb3.append("Hoca");
	sb3.capacity();
	System.out.println(" sb3 append:"+sb3);
	System.out.println(" sb1 uzunluk:"+sb1.length());
	System.out.println(" sb1 kapasite:"+sb1.capacity());
}
}
