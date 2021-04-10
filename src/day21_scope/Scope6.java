package day21_scope;

public class Scope6 {
	public int num1;   //access modifier public yapilinca heryerden ulasilabilir.
	String name="Ali";//access modifier yazilmadigi icin default gecerlidir.
	                   //sadece packet icinde kullanilabilir.

	public static void main(String[] args) {
     add();

	

	}
	public static void add() {
		int num2=6;
		char letter;
		System.out.println("Do addition");
		letter='a';
		System.out.println(num2+ " " +letter);
				
		
	}
	}
			


