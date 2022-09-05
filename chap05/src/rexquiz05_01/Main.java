package rexquiz05_01;

public class Main {
	public static void printArray(String[] arrays) {
		for(String array:arrays) {
			System.out.println(array);
		}
	}

	// ②
	public static int add(int x, int y) {
		return x + y;
	}

	// ③
	public static double mul(double x, double y) {
		return x * y;
	}

	// ④
	public static double div(int x, int y) {
		return (double)x / y;
	}

	// ⑤
	public static char[] makeArray() {
		return makeArray(1);
	}

	// ⑥
	public static char[] makeArray(int size) {
		return new char[size];
	}
	public static void main(String[] args) {
		// 上記のメソッドを呼び出すコードを記述しなさい。引数の値は自由に決めて構いませんが型に会った記述をすること。
		// 戻り値がある場合は変数を宣言しそれに戻り値を代入すること。こちらの変数名も自由に決めて構いません。
		// ①
		String[] name = {"湊　雄輔", "朝香　あゆみ", "菅原　拓真"};
		printArray(name);

		// ②
		int x = add(10, 20);
		

		// ③
		double y1  = mul(2.0, 4.0);

		// ④
		double y2 = div(8, 2);

		// ⑤
		char[] a1 = makeArray();

		// ⑥
		char [] a2 = makeArray(10);

	}


}
