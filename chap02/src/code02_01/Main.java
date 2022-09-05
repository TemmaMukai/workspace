package code02_01;

public class Main {

	public static void main(String[] args) {
		int a;            //①変数宣言の文
		int b;            //①変数宣言の文 
		a = 20;           //②計算の文（代入）
		b = a + 5;        //②計算の文（足し算して代入）
		System.out.println(a);
		System.out.println(b);
		
		a = 0x11;      //16 + 1　１６進数
		b = 0b0011;     //2 + 1　２進数
		int c = 011;   //8 + 1 ８進数 
		System.out.println(a); 
		System.out.println(b);
		System.out.println(c);
		a = 1_000_000_000;
		
		char test;
		test = '\'';
		System.out.println(test);
		String name;
		name = "\\";
		System.out.println(name);
	}

}