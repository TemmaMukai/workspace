package rensyu04_04;

public class Main {
	public static void main(String[] args) {
		int[] numbers = {3,4,9};
		System.out.println("1桁の数字を入力してください");
		int imput = new java.util.Scanner(System.in).nextInt();
		for (int i : numbers) {
			if (i ==imput )
			System.out.println("アタリ！");
		}
	}

}
