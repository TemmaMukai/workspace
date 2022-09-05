package code15_05;

public class Main {

	public static void main(String[] args) {
		if (isValidPlayerName("MINATO00")) {
			System.out.println("正しい記述です");
		} else {
			System.out.println("記述が間違っています");
		  }
		}

		public static boolean isValidPlayerName(String name) {
			return name.matches("[A-Z][A-Z0-9]{7}");
	}

}
