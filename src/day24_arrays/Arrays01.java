package day24_arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		int sayi=10;
		int say2=20;
		int sayi3=30;
		String isim="Ali";
		int arr[]= {10,20,30};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		String takim[]=new String[7];
		System.out.println(Arrays.toString(takim));
		takim[0]="Ali";
		System.out.println(Arrays.toString(takim));
	takim[2]="Hasan";
	takim[1]="Veli";
	System.out.println(Arrays.toString(takim));
	//takim[3]="Mehmet";
	takim[1]="Kemal";
	System.out.println(Arrays.toString(takim));
	System.out.println(takim.length);
	takim[takim.length-1]="Mehmet";
	System.out.println(Arrays.toString(takim));
	if(takim.length%2==1) {
		int ortaIndex=(takim.length-1)/2;
		takim[ortaIndex]="Can";
		System.out.println(Arrays.toString(takim));
	}
	
	}

}
