package comment;

public class practice06_01Kouhan {
	public static void CallDeae() {
		System.out.println("えぇい、こしゃくな。くせ者だ!であえい!");
	}
	public static void showMondokoro() throws Exception{
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目に入らぬか!");
		comment.practice06_01Zenhan.doTogame();
	}
	public static void showMondokoro2() throws Exception{
		System.out.println("飛車さん、角さん。もういいでしょう。");
		System.out.println("この紋所が目に入らぬか!");
		Thread.sleep(3000);
		comment.practice06_01Zenhan.doTogame();
	}

}
