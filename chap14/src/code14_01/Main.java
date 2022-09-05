package code14_01;

public class Main {

	public static void main(String[] args) {
		Object e = new Empty();
		Object o = e.toString(); 
		Object s = "こんにちは";
		System.out.println(s);
		printAnything(s);
	}
	
	public static void printAnything(Object o) {
		System.out.println(o.toString());
	}

}
