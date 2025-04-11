package java_17;

import java.io.FileWriter;
import java.io.IOException;

public class Code17_02 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			
		}catch(IOException e) {
			System.out.println("エラーが発生しました。");
		}

	}

}
