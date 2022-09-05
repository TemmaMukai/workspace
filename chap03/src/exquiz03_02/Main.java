package exquiz03_02;

public class Main {
	public static void main(String[] args) {
		System.out.println("今年の干支を入力してください");
		String zodiac = new java.util.Scanner(System.in).nextLine();
		switch (zodiac) {
		case "寅":
			System.out.println("アタリ！");
			break;
		case "丑":
			System.out.println("それは去年です");
			break;
		case "卯":
			System.out.println("それは来年です");
			break;
		default:
			System.out.println("残念、正解は\"寅\"歳でした");
			break;
		}
	}

}
