package day33_encapsulation;

public class Encapsulation02 {
    private String okulIsmi="Yildiz Koleji";  //okul isminin baska class lardan okunmasini ama deger atanmasini istemiyorsak getter methodu olustururruz 
	private String tcNo="12345678901";
    private int hesapNo=5554321;
    public int sayi=100;   
	public static void main(String[] args) {     //Eger ulasmak istedigimiz class uyeleri public degilse 
		                                         //baska package lardan ulasmak icin ekstra islem yapmamiz gerekir.
		                                         //1. islem encapsulation(Data saklama)guvenlik icin
		                                         //Bu class da kimseyle paylasmak istemedigimiz variable ve methodlar olusturalim
		                                          //private yapinca guvenlik sagladik.Ancak bu durumOOP konsepte aykiridir
		                                          //Encapsulation clasimizda olusturdugumuz uyelerine kimlerin ne sekilde ulasabilecegini belirlemek icin yapilir
	}
      private void denemeMethod() {
    	  System.out.println("Deneme methodu calisti");
      }
	public String getOkulIsmi() {
		return okulIsmi;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public void setHesapNo(int hesapNo) {
		this.hesapNo = hesapNo;
	}
	
}
