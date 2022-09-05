package code16_04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		Iterator<String> it = colors.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.print(s + "→");
		}
		for (String t : colors) {
			System.out.print(t + "→");
		}
	}

}
