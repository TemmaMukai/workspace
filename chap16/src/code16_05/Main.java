package code16_05;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> words = new LinkedHashSet<String>();
		words.add("dog");
		words.add("cat");
		words.add("wolf");
		words.add("panda");
		Iterator<String> it = words.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + "→");
		}
	}

}
