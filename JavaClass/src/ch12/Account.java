package ch12;

public class Account {
	private int total;
	public Account(int total) {
		this.total = total;
	}
	//synchronized : ���ÿ� �޼ҵ带 ����ϴ� ���� ����
	synchronized void deposit(int amt, String name) {
		total += amt;
		
	}
	synchronized void withdraw(int amt, String name) {
		if(amt<=total) {
			total -= amt;
			System.out.println(name+"��� : "+amt);
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	void print() {
		System.out.println("�ܾ� : "+total);
	}

}
