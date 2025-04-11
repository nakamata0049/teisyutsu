package java_15;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Code15_13 {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//文字列からDateインスタンスを生成
		Date d = f.parse("2023/09/18 05:53:20");
		System.out.println(d);
		//Dateインスタンスから文字列を生成
		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s + "です");
	}

}
