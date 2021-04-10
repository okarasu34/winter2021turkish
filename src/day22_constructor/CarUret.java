package day22_constructor;

public class CarUret {
	public CarUret() {
		
	}
	
	String marka;
	String model;
	int yil;
	boolean kazasiVarMi;
	
    public void yakit(String yakit) {
    	System.out.println("Araba yakit olarak"+yakit +"kullanir");
    }
	
    public void vites(String vites) {
    	System.out.println("Araba "+ vites +"vitestir.");
    }
    
}
