package day12;

public class C2_EqualsIgnoreCase {

	public static void main(String[] args) {
		
		String str1="Ali Can";
		String str2="ali CAN";
		String str3="Ali can ";
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str3));
	}

}
