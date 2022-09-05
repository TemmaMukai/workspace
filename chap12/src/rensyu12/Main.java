package rensyu12;

public class Main {

	public static void main(String[] args) {
		X obj = new A();
		obj.a();
		//obj.b();
		//obj.c(); 
		Y y1 = new A();
		Y y2 = new B();
		y1.a();
		y2.a();
		Y[] Yy= new Y[2];
		Yy[0] = new A();
		Yy[1] = new B();
		for(Y y : Yy ) {
			y.b();
		}
		
	}

}
