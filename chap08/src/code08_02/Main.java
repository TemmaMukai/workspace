package code08_02;

public class Main {
	public static void main(String[] args) {
		//1�D�E�҂𐶐�
		Hero h = new Hero();
		//2�D�t�B�[���h�ɏ����l���Z�b�g
		h.name = "�~�i�g";
		h.hp = 100;
		
		Matango m1 = new Matango();
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();
		m2.hp = 48;
		m2.suffix = 'B';
		
		// �`���̂͂��܂�
		h.slip();
		m1.run();
		m2.run();
		h.run();
		
		//System.out.println("�E��" + h.name + "�𐶂ݏo���܂����I");
		//3�D�E�҂̃��\�b�h���Ăяo���Ă���
		/*h.sit(5);
		h.slip();
		h.sit(25);
		h.run();*/
	}

}
