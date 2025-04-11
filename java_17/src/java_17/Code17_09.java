package java_17;

import java.io.FileWriter;
import java.io.IOException;

public class Code17_09 {
	//ファイルが開いた時だけcloseする
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.text");
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			if (fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					;
				}
			}

		}

	}

}
