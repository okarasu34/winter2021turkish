package day31_StringsBuilder;

public class C4_VarArgs03 {
	public static void main(String[] args) {
		toplama(2,5);
		toplama(5,10,15);
		toplama(4,5,9,7);
		toplama(5,6,8,10,45,78,-12);	
		
	}

	
		public static void toplama(int sayi1,int... var) {
		System.out.println("Vararga dahil olmayan argument:"+sayi1);	
		int toplam=0;
		for (int each : var) {
			toplam+=each;
			
		}
		
		System.out.println(sayi1*toplam);
		}

	}


