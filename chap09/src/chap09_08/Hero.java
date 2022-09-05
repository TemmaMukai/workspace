package chap09_08;

public class Hero {
	String name;
	int hp;
	
	public void attack() {
		
	}
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	public Hero() {
		this("ダミー");
		//this.hp = 100;
		//this.name = "ダミー";
	}

}
