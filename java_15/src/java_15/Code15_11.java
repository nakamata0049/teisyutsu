package java_15;
import java.util.Date;

public class Code15_11 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1694984000000L);
		System.out.println(past);
	}

}
