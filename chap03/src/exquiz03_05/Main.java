package exquiz03_05;

public class Main {
	public static void main(String[] args) {
		int count = 20;
		while(count > 0) {
			System.out.println(count);
			count-= 3;
		}
		count = 20;
		do {
			System.out.println(count);
			count+= 3;
		}while (count < 20);
	}

}
