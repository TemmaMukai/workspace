package code06_02;

import calcapp.logics.CalcLogic;

public class Calc {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
		
	}
	/*public static int tasu(int a, int b) {
		return (a + b);
	}
	public static int hiku(int a, int b) {
		return (a - b);
	}*/

}
