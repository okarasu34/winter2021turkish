package day28ForEach;

import java.util.ArrayList;
import java.util.List;

public class C5_ForEach5 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(3);
		list.add(8);
		System.out.println(list);
		
        int karelerinToplam=0;
        
		for (Integer each : list) {
			karelerinToplam+= each*each;
		}
        System.out.println(karelerinToplam);
        
        
	}

}
