package code15_12;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//6つのint値からDateインスタンスを生成
		c.set(2019,8,22,1,23,45);
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		//Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		int m = c.get(Calendar.MONTH);
		int de = c.get(Calendar.DAY_OF_MONTH);
		int h = c.get(Calendar.HOUR);
		int mi = c.get(Calendar.MINUTE);
		System.out.println("現在は" + y + "年" + m + "月" + de + "日" + h +"時" + mi + "秒です");

	}

}
