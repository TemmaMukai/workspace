package code17_01;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw  = new FileWriter("data.txt");
			fw.close();
		} catch (IOException e) {
			System.out.println("エラーが発生しました。");
		}
	}

}
