package code03_08;

public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.print("現在" + (i + 1) + "周目→");
		}
		System.out.println("\n");      //\nで改行
		for (int i = 0; i < 3; i++) {
			System.out.print("現在" + (i + 1) + "周目→");
		}
		System.out.println("\n");
		for (int i = 0; i < 2; i++) {
			System.out.print("現在" + (i + 1) + "周目→");
		}
//		ループ変数を1からスタートする
		for (int i = 1; i < 10; i++) {

		}
//		ループ変数を２ずつ増やす
		for (int i = 0; i < 10; i += 2) {

		}
//		ループ変数を10から１まで減らす
		for (int i = 10; i > 0; i--) {

		}
//		ループ変数を初期化いしない
		{
			int i = 0;
			for (; i < 10; i++) {

			}
		}
//		繰り返し時の処理を行わない
		for (int i = 0; i < 10;) {

		}
	}

}
