package java_17;

import java.io.FileWriter;

public class Code17_03 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("data.txt");
			fw.write("Hello!");
			fw.close();
		} catch(Exception e) {	//Exceptionにすることですべての例外に対する処理を記述できる
			System.out.println("何かしらのエラーが発生しました");
		}

	}

}
