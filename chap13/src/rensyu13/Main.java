package rensyu13;

public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();
		h.setName("ミナト");
		h.setHp(50);
		h.setMp(5);
		
		Wizard w = new Wizard();
		w.setName("ポッター");
		w.setHp(40);
		w.setMp(7);
		w.setWand(wand);
		
		
		Wand wand = new Wand();
		wand.setName("ニワトコの杖");
		wand.setPower(99.9);
		
	}

}
