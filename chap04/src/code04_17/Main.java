package code04_17;

public class Main {

	public static void main(String[] args) {
		int[] array = { 1,2,3 };
		array = null;	//参照を切る
//		array[0] = 10;
		if (array == null) {
			System.out.println("中身はnullです");
		}
		String str = "javaで開発";
		System.out.println(str.length());
	}

}
