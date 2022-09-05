package rensyu14_01;

public class Account {
	String accountNumber;
	int balance;
	
	@Override
	public String toString() {
		return "\\" + this.balance + "(口座番号:" + this.accountNumber + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Account) {
			Account a = (Account)o;
			String an1 = this.accountNumber.trim();
			String an2 = a.accountNumber.trim();
			if (an1.equals(an2)) {
				System.out.println("口座番号を照会しました");
				return true;
			}
		}
		System.out.println("口座番号を正しく入力してください");
		return false;
	}

}
