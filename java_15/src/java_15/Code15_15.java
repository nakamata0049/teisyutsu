package java_15;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Code15_15 {

	public static void main(String[] args) {
		//LocalDateTimeの生成
		LocalDateTime l1 = LocalDateTime.now();
		LocalDateTime l2 = LocalDateTime.of(2024,  1, 1, 9, 5, 0, 0);
		
		//LocalDateTimeとZoneDateTimeの相互互換
		ZonedDateTime z1 = l2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = z1.toLocalDateTime();
	}

}
