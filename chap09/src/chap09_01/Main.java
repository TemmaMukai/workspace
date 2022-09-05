package chap09_01;

public class Main {
	public static void main(String[] args) {
		Hero h1;
		h1 = new Hero();
		h1.hp = 100;
		Hero h2 = new Hero();//h2の参照先がないためガベージコレクション
		h2 = h1;//アドレスがコピーされる
		h2.hp = 200;
		System.out.println(h1.hp);
	}

}
