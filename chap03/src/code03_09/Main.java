package code03_09;

public class Main {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
				
			}
			System.out.println("");
		}
		for (int i = 10; i < 100; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j);
				System.out.print(" ");
			}
			System.out.println("");
		}
		
		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				break;			//３の時ブロックから抜ける、１と２しか表示されない
//			if (i == 3 || i == 5) {
//				continue;		３と５以外が表示される
			}
			System.out.println(i);
		}
	}

}
