package day37_overriding;

public class Formen extends Isci {
	
	String sorumluOldBolum="bakim";
	public String isim="Emrullah";
	public static void main(String[] args) {
		Formen fr1=new Formen();
		fr1.sorumluOldBolum="Marangozhane";
		fr1.maas=10000;
		System.out.println(fr1.isim+" "+ fr1.sorumluOldBolum+" "+fr1.maas);
		Isci fr2=new Formen();
		fr2.bolum="Kaynak Atolyesi";
		
		System.out.println(fr2.isim+" "+ fr2.bolum+" "+fr2.maas);
		Personel fr3=new Formen();
		System.out.println(fr3.isim);
		
	}

}
