package chap09_05;

public class Hero {
	String name;
	int hp;
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に５ポイントのダメージを与えた！");
	}

}
