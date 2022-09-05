package rensyu14_01;

public class Main {

	public static void main(String[] args) {
		Account an1 = new Account();
		an1.accountNumber = "4649";
		an1.balance = 1592; 
		Account an2 = new Account();
		an2.accountNumber = "4649";
		an2.balance = 1592;
		if (an1.equals(an2)) {
			System.out.println(an1);
			System.out.println(an2);
		}else {
			//System.out.println("口座番号が違います");
		}
	}

}
