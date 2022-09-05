package rensyu08_01;

public class Cleric {
	String name;
	int hp = 50;
	public static final int MAXHP = 50;
	int mp = 10;
	public static final int MAXMP= 10;  
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		if (mp > 0) {
			this.mp -= 5;
			System.out.println("残りのMPは" + this.mp + "になった");
			this.hp = this.MAXHP;
		System.out.println("HPが" + this.hp +"まで回復した");
		}else {
			System.out.println("MPが足りません");
		}
	}
	
	public int pray(int sec) {
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAXMP - this.mp, recover);
		this.mp += recoverActual;
		System.out.println("MPが" + recoverActual + "回復した");
		System.out.println("MPは" + this.mp + "になった");
		return recoverActual;
	}

}
