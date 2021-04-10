package day08;

public class C2_NestedIf {

	public static void main(String[] args) {
        
         String cinsiyet="Kadin";
         int yas=58;
		
		
		 if (cinsiyet.equalsIgnoreCase("erkek")) {
			if (yas<0) {
				System.out.println("yas negatif olamaz");
				
			}else if (yas<65) {
				System.out.println("emekli olamazsiniz");
				
			}else {
				System.out.println("Emekli olabilirsin");
			}
			 
			 
			 
			  
		} else if (cinsiyet.equalsIgnoreCase("kadin")) {
			
			if (yas<0) {
				System.out.println("yas negatif olamaz");
				
			}else if (yas<60) {
				System.out.println("emekli olamazsiniz");
				
			}else {
				System.out.println("Emekli olabilirsin");
			}
		
		
		}else {
           System.out.println("girdiginiz veri sisteme katitli degildir");
		}

	}
}