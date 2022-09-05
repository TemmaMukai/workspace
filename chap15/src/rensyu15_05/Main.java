package rensyu15_05;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDate time = now.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM日dd");
		System.out.println(time.format(fmt));
	}


}
