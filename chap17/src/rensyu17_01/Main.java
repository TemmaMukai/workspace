package rensyu17_01;

public class Main {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
		}
		
		catch (NullPointerException e) {
			System.err.println
			("NullPointerException例外をcatchしました");
			System.err.println("ーースタックトレース(ここから)ーー");
			e.printStackTrace();
			System.err.println("ーースタックトレース(ここまで)ーー");
		}
	}

}
