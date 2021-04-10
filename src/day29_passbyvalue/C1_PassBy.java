package day29_passbyvalue;

public class C1_PassBy {

	public static void main(String[] args) {
	double fiyat=100;
		indirimUygula(fiyat);
	System.out.println("method call sonrasi fiyat:" +fiyat);
	
	 
	
	
	
	}

	public static void indirimUygula(double fiyat) {
		fiyat=fiyat*0.90;
		System.out.println("%10 indirimli fiyat:" +fiyat);
		System.out.println(fiyat-10);
	}

}
