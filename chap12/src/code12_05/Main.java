package code12_05;

public class Main {

	public static void main(String[] args) {
		Slime s = new Slime();
		Monster m = new Slime();
		s.run();
		m.run();
		if(m instanceof Slime) {
			s = (Slime)m;
			s.run();
			
		}
		
		if(m instanceof Slime) {
			s = (Slime)m;
			m.run();
					
		}
	}

}
