package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptions01 {

	public static void main(String[] args) {
		
          try {
			FileInputStream fis=new FileInputStream("C:\\Users\\ozckr\\eclipse-workspace\\technospring2020\\winter2021turkish\\src\\day39_exceptions\\file");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	System.out.println("kod bloke olmadi");
	
	}

}
