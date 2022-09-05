package rensyu16_02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木"); 
		List<Hero> hero = new ArrayList<Hero>();
		hero.add(h1);
		hero.add(h2);
		Iterator<Hero> it = hero.iterator();
		while (it.hasNext()) {
			Hero e = it.next();
			System.out.println(e.getName());
		}
	}

}
