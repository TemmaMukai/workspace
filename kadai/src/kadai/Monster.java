package kadai;

public abstract class Monster {
	private String name;
	private int hp;
	private int mp;
	
	public abstract void attack(Character c);
	public abstract void run();

}
