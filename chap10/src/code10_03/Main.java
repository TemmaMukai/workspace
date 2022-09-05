package code10_03;

public class Main {
	public static void main(String[] args) {
		Hero h = new Hero();
		h.run();
		SuperHero sh = new SuperHero();
		Matango m = new Matango();
		sh.attack(m);
		sh.fly();
		sh.attack(m);
	
	}

}
