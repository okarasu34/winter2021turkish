package day33_encapsulation;

import day20_scope.Scope1;
import day21_scope.Scope6;

public class Encapsulation01 {

	public static void main(String[] args) {
		                                       //OOP Concept
		                                        //Bir proje kapsamindaki class larda olusturulan variable ve method larin
		                                        //baska classlarda tekrar yazilmamasi ,var oldugu class dan obje uretilerek 
		                                        //Bu variable ve method larin istendigi kadar kullanilmasidir.(reusibility)
		                                          //Static programlamada tehlikelidir.Cunku disaridan kolay degistirilebilir.
		Scope6 obj1=new Scope6();//esitligin sol tarafi declaration 
		                         // declaration 2 parcadir ilk parca data turu ikinci kisim da isim dir.
                                 //non primitive lere data turu ayni zamanda class ismi de olabilir.		
                                 //		
		obj1.num1=10;
		System.out.println(obj1.num1);
		obj1.add();
	                                  //deneme(); methodu static olmadigi icin direk cagirilamaz.Bunun yerine icinde oldugumuz class dan
        Encapsulation01 obj3=new   Encapsulation01();                  		
	    obj3.deneme();
	}
       public void deneme() {
	    Scope1 obj2=new Scope1();     //Proje kapsaminda bulunan tum class lardan public variable ve method lara
	                                   //obje ureterek ulasabilirim.Eger ulasmak istedigim class memberler public degilse baska packet lerden ulasmak icin
	                                   //ektra islem yapmam gerekir.
	    obj2.isim="Ahmet";
	    obj2.soyisim="Ozcelik";
	    obj2.sayi=20;
	    obj2.method();
	
	
	
}
}
