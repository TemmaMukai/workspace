package code11_01;

public class Hero extends Character {
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に１５ポイントのダメージをあたえた！");
		m.hp -= 10;
	}

}
