package day31_StringsBuilder;

import java.util.ArrayList;
import java.util.List;

public class C5_VarArgs04 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list.add(10);
		list.add(20);
		int arr[]= {15,20,25};
		toplama(arr);
		
	}
		public static void toplama(int... var) {
			
			int toplam=0;
			for (int each : var) {
				toplam+=each;
				
			}
			
			System.out.println(toplam);
			

	}

}
