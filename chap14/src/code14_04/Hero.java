package code14_04;

public class Hero {
	String name;
	int hp;
	int mp;
	
	public String toString() {
		return "名前:" + this.name + "／HP:" + this.hp;
	}
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Hero) {
			Hero h = (Hero)o;
			if (this.name.equals(h.name) && this.hp == h.hp) {
				return true;
			}
		}
		return false;
	}

}
