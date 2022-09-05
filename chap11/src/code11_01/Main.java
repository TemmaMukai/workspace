package code11_01;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.name = "勇者";
		
		Matango m = new Matango();
		m.hp = 50;
		h.attack(m);
		Dancer d = new Dancer();
		d.name = "ダンサー";
		d.attack(m);
	}

}
