package rensyu05_03;

public class Main {
	public static void main(String[] args) {
		String address = "xxxx@yyyy.com";
		String text = "来週の日曜日、ご飯に行きませんか？";
		String title ="お知らせ";
		email(title, address, text);
	}
	public static void email(String title, String address, String text)  {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}

}
