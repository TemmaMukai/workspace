package code08_02;

public class Hero {
	String name;	//���O�̐錾
	int hp;			//HP�̐錾
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "�́A�����ĉ񕜂����I");
	}
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "�́A" + sec + "�b�������I");
		System.out.println("HP��" + sec + "�|�C���g�񕜂���");
	}
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "�́A�]�񂾁I");
		System.out.println("5�̃_���[�W�I");
	}
	public void run() {
		System.out.println(this.name + "�́A�����������I");
		System.out.println("GAMEOVER");
		System.out.println("�ŏIHP��" + this.hp + "�ł���");
	}

}
