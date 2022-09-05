package rensyu11;

public abstract class IntangibleAsset extends Asset {
	String color;
	public IntangibleAsset(String name, int price, String color) {
		super(name, price);
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}

}
