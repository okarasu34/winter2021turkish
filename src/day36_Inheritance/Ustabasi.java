package day36_Inheritance;

public class Ustabasi extends Isci {
       
	public String  bolum="Takimhane";
	public int sorOldIscisay=20;
	
	
	
	
	public static void main(String[] args) {
		Ustabasi ub1=new Ustabasi();
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorOldIscisay);
		System.out.println(ub1.saatucreti);
		System.out.println(ub1.isim);
		
		Isci ub2=new Ustabasi();
		System.out.println(ub2.departman);
		System.out.println(ub2.izindeMi);
	   
		
		
		
		Personel ub3=new Ustabasi();
	    System.out.println(ub3.id);
	    	
		
	}
	
	
	
}
