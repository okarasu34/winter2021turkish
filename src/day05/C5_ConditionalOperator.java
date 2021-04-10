package day05;

public class C5_ConditionalOperator {
// && AND operatoru mukemmeliyetcidir,matematikteki carpma islemi gibidir.
//|| OR operatoru ise optimisttir.Verilen karsilastirmalardan bir tanesi bile dogruysa true verir.
	public static void main(String[] args) {
		boolean isTrue=5>4 && 7-3>0; 
		
		System.out.println(isTrue);
		int x=10;
		int y=5;
		System.out.println(x/y==2 && x*y>20 && x-y>0);
		System.out.println(x+y<0 && x-y>0 );
		
	}

}
