package day34_inheritance;

public class Encapsulation {

	private String okulIsmi="Yildiz Koleji";//Eger sadece getter metodlati olursa data degerleri degistirilemez
	private int okulHesapNo=12345;          //ama sadece okunabilir.Bu tarz class lara immutable class lar denir.
	private boolean okulAcikMi=true;

	public String getOkulIsmi() {
		return okulIsmi;
	}
	public int getOkulHesapNo() {
		return okulHesapNo;
	}
	public boolean isokulAcikMi() {
		return okulAcikMi;
	}
	public void setOkulIsmi(String okulIsmi) {
		this.okulIsmi=okulIsmi;
	}
	public void setOkulHesapNo(int okulHesapNo) {
		this.okulHesapNo=okulHesapNo;
	}
	public void setOkulAcikMi(boolean okulAcikMi) {
		this.okulAcikMi=okulAcikMi;
	}
	
	
	
	
}
