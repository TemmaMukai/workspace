package rensyu03_05;

public class Main {
	public static void main(String[] args) {
		System.out.print("［メニュー］1:検索 2:登録 3:削除 4:変更＞");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
		case 1:
			System.out.print("検索します");
			break;
		case 2:
			System.out.print("登録します");
		case 3:
			System.out.print("削除します");
		case 4:
			System.out.print("変更します");
		}
	}

}
