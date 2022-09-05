package code02_05;

public class Main {

	public static void main(String[] args) {
		float f = 3;  //float型の変数にInt型を代入
		double d = f; //double型の変数にfloat型を代入
		System.out.println(f);
		System.out.println(d);

		//int i = 3.2;
		byte b = 1;
		short a = 2;
		int c = 126;
		b += c; //複合代入演算子を入れるとエラーにならない
		System.out.println(b);
		char ch = 48;
		char ch2 ='0';
		System.out.println(ch);
		System.out.println(ch2);
		

	}

}
