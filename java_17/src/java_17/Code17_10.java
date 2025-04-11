package java_17;

import java.io.FileWriter;

public class Code17_10 {
	//try-with-resources文 自動的にclose()が呼び出される
	public static void main(String[] args) {
		try (FileWriter fw = new FileWriter("data.txt");) {
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		}

	}

}
