package java_16;

import java.util.HashSet;
import java.util.Set;

public class Code16_03 {
	//Setを使ったプログラム
	public static void main(String[] args) {
		Set<String> colors = new HashSet<String>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		colors.add("赤");	//重複は無視される
		System.out.println("色は" + colors.size() + "種類");

	}

}
