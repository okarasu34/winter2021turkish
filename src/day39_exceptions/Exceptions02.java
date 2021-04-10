package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		
	    try {
				FileInputStream fis=new FileInputStream("C:\\Users\\ozckr\\eclipse-workspace\\technospring2020\\winter2021turkish\\src\\day39_exceptions\\file");
			int k =0;
	    try {
			while((k=fis.read())!=-1) {
				System.out.println(k);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	    
	    } catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
		System.out.println("kod bloke olmadi");
		
		

	}

}
