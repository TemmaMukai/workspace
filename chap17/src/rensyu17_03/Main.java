package rensyu17_03;

public class Main {

	public static void main(String[] args) {
		try {
			int i = Integer.parseInt("三");
			//System.out.println(i);	
		} catch (NumberFormatException e) {
			System.err.println
			("NumberFormatExceptionをcatchしました");
			e.printStackTrace();
		}
	}

}
