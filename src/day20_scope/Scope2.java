package day20_scope;

public class Scope2 {
	public static void main(String[] args) {
		Scope1 obj4=new Scope1();
		obj4.soyisim="Can";
		obj4.soyisim="Ahmet";
		System.out.println(obj4.isim+" "+obj4.soyisim);
		
	}

}
