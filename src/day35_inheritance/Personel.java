package day35_inheritance;

public class Personel {
	
	public String isim;
	public int sayi;
	
	public Personel() {                                       //Parametresiz
		                                                     //super();child class olmadigi icin super keyword u silinebilir.
	
	System.out.println("Personel parametresiz constructor calisti");
	}                                                       //child class da olmak zorunda
	
	
	public Personel(String isim, int sayi) {      //Parametreli
		System.out.println("Personel parametreli constructor calisti");                                           //super();
		
	}
	

	
	
	
	
}
