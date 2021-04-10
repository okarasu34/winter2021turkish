package day14_MethodCreation;

public class C3_MethodCreation3 {

	public static void main(String[] args) {

		ortalama(80,60);
		ortalama(80,60,55);
	}

	public static void ortalama(double sayi1, double sayi2, double sayi3) {
		System.out.println("Uc sayinin ortalamasi:" + (sayi1 + sayi2 + sayi3) / 3);
	}

	public static void ortalama(double sayi1, double sayi2) {
		System.out.println("Uc sayinin ortalamasi:" + (sayi1 + sayi2) /2);
	}

}
