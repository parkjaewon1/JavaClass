package ch12;
public class Account2 {
	private int total;
	public Account2(int total) {
		this.total = total;
	}

	void depoist(int amt, String name) {
		total += amt;
		System.out.println(name+"�Ա� : "+amt);
	}
	void withdraw(int amt, String name) {
		if (amt <= total) {
			total -= amt;
			System.out.println(name+"��� : "+amt);
		} else System.out.println("�ܾ��� �����մϴ�. ���� ");
	}
	void print() {
		System.out.println("�ܾ� : "+ total);
	}
}