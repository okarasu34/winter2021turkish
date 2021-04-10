package day31_StringsBuilder;

public class C3_VarArgs02 {

	public static void main(String[] args) {
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);
		
		
		
		

		
		
	}

	public static void toplama(int... var) {
		int toplam=0;
		for (int j : var) {
			toplam+=j;
		}
		System.out.println("toplam:" + toplam);
	}

}
