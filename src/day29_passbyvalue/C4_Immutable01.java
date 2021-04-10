package day29_passbyvalue;

import java.util.ArrayList;
import java.util.List;

public class C4_Immutable01 {

	public static void main(String[] args) {
		String isim = "Ali";
		isim.concat("can");
		System.out.println(isim);//
		System.out.println(isim.concat("can"));

		System.out.println(isim);
        List<String>isimList=new ArrayList<>();
	isimList.add("Ali");
	isimList.add("can");
	System.out.println(isimList);
	isimList.remove(1);
	System.out.println(isimList);
	
	
	}

}
