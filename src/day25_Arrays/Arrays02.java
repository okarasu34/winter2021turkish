package day25_Arrays;

import java.util.Arrays;

public class Arrays02 {

	public static void main(String[] args) {
		
		
		int arr[]= {10,25,3,16,75};
		int sayi=25;
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==sayi) {
				flag=true;
			}
		
		}if(flag) {
			System.out.println("array sorulan elemani iceriyor.");
		}else {
			System.out.println("array sorulan elemani icermiyor.");
		}
		
		Arrays.sort(arr);
		Arrays.binarySearch(arr, sayi);
		System.out.println(Arrays.binarySearch(arr,5));
		int arr2[]= {12,15,25,14,3,12,65};
		Arrays.sort(arr2);
		System.out.println(Arrays.binarySearch(arr2,14));
		System.out.println(Arrays.binarySearch(arr2,20));
		System.out.println(Arrays.binarySearch(arr2,12));
		System.out.println(Arrays.binarySearch(arr2,2));
	
	String arrayString=Arrays.toString(arr2);
	System.out.println(arrayString);
	System.out.println(arrayString.substring(5));
	
	
	
	
	
	}

}
