package kadai;

public abstract class Character {
	private String name;
	private int hp;
	private int mp;

	public Character(String name, int hp, int mp) {
		name = getName();
		hp = getHp();
		mp = getMp();

	}

	public abstract void attack(Monster m);
	public abstract void run();
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHp() {
		return this.hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getMp() {
		return this.hp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}

}
