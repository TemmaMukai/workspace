package code15_16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd(E) KK:mm");
		String format = now.format(fmt);
		System.out.println(format);
		int days = 1;
		int hours = 3;
		LocalDateTime ararm = now.plusDays(days).plusHours(hours);
		String ararmtime = ararm.format(fmt);
		System.out.println
		(format + "から" + days + "日" + hours + "時間後の" + ararmtime + "にアラームをセットしました");
		
		//System.out.println(now);
		//LocalDate ldate = LocalDate.parse("2000/09/22", fmt);
		
		//LocalDate ldatep = ldate.plusDays(1000);
		//String str = ldatep.format(fmt);
		//System.out.println("1000日後は" + str);
		
		//if (now.isAfter(ldatep)) {
			//System.out.println("1000日語は過去の日付です");
		//}
	}

}
