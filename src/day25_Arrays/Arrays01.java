package day25_Arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		int arr[]= {10,23,54};
		String isimler[]=new String[4];
		 System.out.println(isimler[1]);
        isimler[2]="Boss";
        isimler[0]="Elveda";
        System.out.println(Arrays.toString(isimler));
	for (int i = 0; i < isimler.length; i++) {
		System.out.print(isimler[i]+ " ");
			
	}
	System.out.println();
	System.out.println(arr);
	System.out.println(Arrays.toString(arr));
	isimler[1]="Oguzhan";
	isimler[3]="Bilal";
	Arrays.sort(isimler);
	System.out.println(Arrays.toString(isimler));
	
	}

}
