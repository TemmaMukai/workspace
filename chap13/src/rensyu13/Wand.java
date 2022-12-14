package rensyu13;

public class Wand {
	private String name;
	private double power;
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException("名前は3文字以上で指定してください。");
		}
		this.name = name;
	}
	public double getPower() {
		return this.power;
	}
	public void setPower(double power) {
		if (power < 0.5 || power > 100.0) {
			throw new IllegalArgumentException("杖の魔力が異常値です。");
		}
		
		this.power = power;
	}

}
