package rensyu08_01;

public class Main { 
	public static void main(String[] args) {
		Cleric c = new Cleric();
		c.name = "聖職者";
		c.selfAid();
		c.pray(5);
		c.selfAid();
		c.selfAid();
		c.selfAid();
		c.selfAid();
	}

}
