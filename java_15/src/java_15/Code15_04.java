package java_15;

public class Code15_04 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);
	}

}
