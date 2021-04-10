package day33_encapsulation;

public class Encapsulation03 {

	public static void main(String[] args) {
		
		Encapsulation02 obj1=new Encapsulation02();
		Encapsulation02 obj2=new Encapsulation02();
		
		
         
         //Erisim yetkisini ikiye ayiriryoruz
         //1.Okuyabilme(getter) 2.Deger atayabilme(setter)
		System.out.println(obj1.sayi);
         obj1.sayi=25;
         System.out.println(obj1.sayi);
        // obj1.getOkulIsmi()="Mehmet Koleji"; //degistirilmesine izin vermedi sadece okuyabilirim
         System.out.println(obj1.getOkulIsmi());
        
         System.out.println(obj2.sayi);
         obj1.getOkulIsmi();
         System.out.println(obj1.getOkulIsmi());
        obj1.setTcNo("2535364683787");
        //System.out.println(obj1.setTcNo("2535364683787"););set metodu okumaya izin vermez.
        
	}

}
