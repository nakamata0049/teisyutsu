package java_15;
import java.util.Calendar;
import java.util.Date;

public class Code15_12 {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2023, 8, 18, 5, 53, 20);	//Calendarクラスでは月の値は0から11になる
		c.set(Calendar.MONTH, 9);
		Date d = c.getTime();
		System.out.println(d);
		//Dateインスタンスからint値を生成
		Date now = new Date();
		c.setTime(now);
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");

	}

}
