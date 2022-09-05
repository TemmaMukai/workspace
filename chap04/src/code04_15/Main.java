package code04_15;

public class Main {
	public static void main(String[] args) {
		int[] arrayA = {1,2,3};
		int[] arrayB;
		arrayB = arrayA;	//参照先が一緒になる
		arrayB[0] = 100;
		System.out.println(arrayA[0]);

		int A = 1;		//int型やboolean型は基本型変数のため参照型とは別で考える
		int B;
		B = A;
		B = 100;
		System.out.println(A);
	}

}
