package day31_StringsBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C1_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MMMM/dd hh:mm");
		System.out.println(dtf.format(ldt));
		
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("yy/MMM/dd hh:mm");
		System.out.println(dtf2.format(ldt));
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern(" hh:mm");
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern(" hh:mm");
	System.out.println(dtf3.format(ldt));
	System.out.println(dtf3.format(ldt));
	LocalDate dogumTarihi=LocalDate.of(1995,3, 12);
	LocalDate bugun=LocalDate.now();
	Period benimYasim=Period.between(bugun,dogumTarihi);
	System.out.println(benimYasim);
	int yas=Period.between(bugun,dogumTarihi).getYears();
	System.out.println(yas);
	}

}
