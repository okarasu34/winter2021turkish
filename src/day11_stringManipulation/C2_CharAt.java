package day11_stringManipulation;

public class C2_CharAt {

	public static void main(String[] args) {
		/*Bazi hatalar daha kod calistirlimadan gorulur bunlara Compile time eror(CTE)
		 * Bazi hatalarda kod calistirildiktan sonra ortaya cikarBunlara da run time error denir.(RTE)
		 * 
		 * 
		 */
		
		
		String str="Java cok guzel";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(13));
		System.out.println(str.length()-1); // bu son karakterin indeksini bulmak icin kullaniyoruz
		System.out.println(str.length());
		//System.out.println(str.charAt(15));
	}

}
