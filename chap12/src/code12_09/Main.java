package code12_09;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		Slime s = new Slime();
		Goblin g = new Goblin();
		Matango m = new Matango();
		
		h.attack(s);
		h.attack(g);
		h.attack(m);
		
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new Matango();
		for (Monster mo : monsters) {
			mo.run();
		}
	}

}
