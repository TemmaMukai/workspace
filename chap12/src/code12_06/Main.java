package code12_06;

public class Main {

	public static void main(String[] args) {
		/*Hero h1 = new Hero();
		Hero h2 = new Hero();
		Thief t1 = new Thief();
		Wizard w1 = new Wizard();
		Wizard w2 = new Wizard();

		
		h1.hp += 50;
		System.out.println(h1.hp);
		h2.hp += 50;
		System.out.println(h2.hp);
		t1.hp += 50;
		System.out.println(t1.hp);
		w1.hp += 50;		
		System.out.println(w1.hp);
		w2.hp += 50;
		System.out.println(w2.hp);*/

		Character[] c = new Character[5];
		c[0] = new Hero();
		c[1] = new Hero();
		c[2] = new Thief();
		c[3] = new Wizard();
		c[4] = new Wizard();
		
		for (Character ch : c) 
			
		Monster[] monsters = new Monster[3];
		monsters[0] = new Slime();
		monsters[1] = new Goblin();
		monsters[2] = new Matango();
		for (Monster m : monsters) {
			m.run
		}
	}

}
