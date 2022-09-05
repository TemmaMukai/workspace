package code15_09;

public class Main {

	public static void main(String[] args) {
		
		final String FORMAT = "%-9 %-13s 所持金%,6d";
		Hero hero = new Hero("minato", "Hero", 1000); 
		Hero witch = new Hero("asaka", "Witch", 1000);
		Hero saga = new Hero("sugawara", "Saga", 2000);
		
		String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.println(s);
		s = String.format(FORMAT, witch.getName(), witch.getJob(), witch.getGold());
		System.out.println(s);
		s = String.format(FORMAT, saga.getName(), saga.getJob(), saga.getGold());
		System.out.println(s);
	}

}
