package rensyu10_03;

public class PoisonMatango extends Matango {
	int poisonCount = 5;
	public PoisonMatango(char suffix) {
		super(suffix);
	}
	public void attack(Hero h) {
		super.attack(h);
		if (this.poisonCount > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int dmg = h.hp / 5;
			h.hp -= dmg;
			System.out.println(dmg + "ポイントのダメージ");
			this.poisonCount--;
			System.out.println("毒攻撃の残り回数が" + this.poisonCount + "になった");
		}
	}

}
