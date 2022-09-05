package code15_10;

public class Main {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");
		
		start = System.currentTimeMillis();
		s = "Java";
		for (int i = 0; i < 10000; i++) {
			s += "Java";
		}
		end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は…" + (end - start) + "ミリ秒でした");
	}

}
