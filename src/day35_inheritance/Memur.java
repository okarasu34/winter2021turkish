package day35_inheritance;

public class Memur extends Personel {
    public int maas;
    public Memur() {
		super();
	System.out.println("Child Class parametresiz constructor calisti");
    
    }
           
	public Memur(int maas) {
		super();
		System.out.println("Child Class parametreli constructor calisti");
		
	}



	public static void main(String[] args) {
       Memur obj1=new Memur(2400);



}
}