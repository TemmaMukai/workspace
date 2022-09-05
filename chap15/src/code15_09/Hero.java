package code15_09;

public class Hero {
	private String name;
	private String job;
	private int gold;
	
	public Hero() {
		this("ななし", "村人", 100);
	}
	public Hero(String name, String job, int gold) {
		this.name = name;
		this.job = job;
		this.gold = gold;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return this.job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getGold() {
		return this.gold;
	}
	public void setGold(int gold) {
		this.gold = gold;
	}

}
