package day28ForEach;

public class C2_ForEach2 {

	public static void main(String[] args) {
		int arr[]= {1,2,1,2,4,3,1,2};
		int carpim=1;
		for (int each : arr) {
			carpim*=each;
		}
		System.out.println("array in tum elemanlari carpimi:" + carpim);
		
	}

}
